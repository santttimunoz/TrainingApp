package acmelab.ta.enhancements.entity

uses java.util.Date

/**
 * Created with IntelliJ IDEA.
 * User: SMUNOZ
 * Date: 20/12/23
 * Time: 14:06
 * To change this template use File | Settings | File Templates.
 */
enhancement ABContactAnalysisEnhancement : entity.ABContact {
  property get NextCourtesyContact() : Date{
    var  numberOfMonthsNextCourtesyContact = 6  // local variable in case script parameter is deleted, etc.
    // see if parameter exists
    if (ScriptParameters.Type.TypeInfo.Properties.firstWhere( \ parameter -> parameter.Name=="NumberOfMonthssNextCourtesyContact")!=null) {
      // assign script parameter to local variable
      numberOfMonthsNextCourtesyContact = ScriptParameters.NumberOfMonthsNextCourtesyContact
    }
    // check for a date and that the variable value is greater than zero
    if (this.LastCourtesyContact_Ext != null && numberOfMonthsNextCourtesyContact > 0)  {
      var nextCourtesyDate = this.LastCourtesyContact_Ext.addMonths(numberOfMonthsNextCourtesyContact)
      return nextCourtesyDate
    }
    return null

  }
  function upgradeToStrategicPartner(): void{
    if(this.IsStrategicPartner_Ext != true){
      this.IsStrategicPartner_Ext = true
    }
    if(this.CustomerRating_Ext == null){
      this.CustomerRating_Ext = 25
    }
    if(this.CustomerRating_Ext >= 0 and this.CustomerRating_Ext <= 989.9){
      this.CustomerRating_Ext += 10
    }else{
      this.CustomerRating_Ext = 999.9
    }
  }
}
