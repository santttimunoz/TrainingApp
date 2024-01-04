package gw.command

uses gw.api.util.DataImportTestUtil
uses gw.api.util.SampleDataGenerator
uses com.guidewire.pl.quickjump.DefaultMethod
uses com.guidewire.pl.quickjump.BaseCommand
uses gw.api.data.BatchDuplicateDataSetHelper

@Export
@DefaultMethod("import")
class ImportSampleData extends BaseCommand {
  function import() : String {
    SampleDataGenerator.generateDefaultSampleData()
    DataImportTestUtil.importZoneData()
    return "Sample Data Imported"
  }

  function importDuplicateContacts() : String {
    //Put call to Duplicate Contact Generator Here
    BatchDuplicateDataSetHelper.insertDuplicateContacts()
    return "Duplicate Contacts Imported"
  }
}
