package acme.ta.enhancements.entity

uses gw.api.util.DateUtil

enhancement Verifiable_ExtEnhancement: entity.Verifiable_Ext {
  /* This functions sets the due date for a verification based on the
     priority. High and urgent objects are set for 3 days. Normal objects
     (and objects without a priority) are set to 7 days. Low-priority
     objects are set for 14 days.
  */

  function setDueDateFromPriority(): void {
    var today = DateUtil.currentDate()
    if ((this.Priority == typekey.Priority.TC_HIGH) or (this.Priority == typekey.Priority.TC_URGENT)) {
      this.VerificationDueDate = DateUtil.addDays(today, 3)
    }
    if ((this.Priority == typekey.Priority.TC_NORMAL) or (this.Priority == null)) {
      this.VerificationDueDate = DateUtil.addDays(today, 7)
    }
    if (this.Priority == typekey.Priority.TC_LOW) {
      this.VerificationDueDate = DateUtil.addDays(today, 14)
    }
  }

  // end of function

}

