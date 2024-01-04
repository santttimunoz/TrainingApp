package acme.ta.batch.legalreport

uses gw.processes.BatchProcessBase
uses gw.transaction.Transaction
uses gw.api.util.DateUtil
uses gw.api.database.Query
uses pcf.ABAddressDetailDV
class FlagOverdueLegalReportsBatch extends BatchProcessBase {
  construct() {
    super(BatchProcessType.TC_FLAGOVERDUELEGALREPORTS)
  }

  override function doWork() {
    // Any batch process that modified data must manually create
    // a bundle.
    Transaction.runWithNewBundle(\bundle -> {
      print("Starting Flag Overdue Legal Reports batch process")
      var numberOfContactsWithOverdueReports = 0
      // Query for legal report messages that have been waiting too
      // long for an acknowledgement. In order to produce interesting
      // results in a classroom setting, the threshold time is set to
      // 15 seconds before the current time.
      var thresholdTime = DateUtil.addSeconds(DateUtil.currentDate(), -15)
      var messageQuery = Query.make(Message)
      messageQuery.compare("SendTime", LessThanOrEquals, thresholdTime)
      messageQuery.compare("DestinationID", Equals, 15)
      var resultsObj = messageQuery.select()
      for (currentMessage in resultsObj) {
        var relatedContact = (currentMessage.MessageRoot as ABContact)
        // Do not flag a contact if it is already flagged for an overdue legal report.
        if (!relatedContact.FlagEntries.hasMatch(\currentEntry ->
            currentEntry.Reason == FlagEntryReason.TC_OVERDUE_LEGAL_REPORT)) {
          // relatedContact was queried for, and therefore is in a read-only bundle.
          // Copy the object into the current, writeable bundle.
          relatedContact = bundle.add(relatedContact)
          var newEntry = new FlagEntry()
          newEntry.FlagDate = gw.api.util.DateUtil.currentDate()
          newEntry.Reason = FlagEntryReason.TC_OVERDUE_LEGAL_REPORT
          relatedContact.addToFlagEntries(newEntry)
          numberOfContactsWithOverdueReports++
        }
      }
      // runWithNewBundle() executes an implicit commit. No manual commit of
      // the bundle is required.
      print("Completed Flag Overdue Legal Reports batch process")
      print("Number of contacts flagged: " + numberOfContactsWithOverdueReports)
    }, "su")
    // identifies the user to use when committing changes, required
    // for batch processes that are scheduled and have no inherent user
    this.incrementOperationsCompleted()
  }
  // end doWork()
}
