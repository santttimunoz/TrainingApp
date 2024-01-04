package acme.ta.batch

uses gw.plugin.processing.IProcessesPlugin
uses gw.processes.BatchProcess
uses acme.ta.batch.legalreport.FlagOverdueLegalReportsBatch

class ProcessesPlugin implements IProcessesPlugin {
  construct() {
  }
  override function createBatchProcess(type : BatchProcessType, arguments : Object[]) : BatchProcess {
    switch(type) {
      case BatchProcessType.TC_FLAGOVERDUELEGALREPORTS:
          var myBatchProcess =  new FlagOverdueLegalReportsBatch()
          return myBatchProcess
      default:
        return null
    }
  }
}
















































































// CurrDev: File Reference is TA80_INTG140_BatchProcess_Lab.docx