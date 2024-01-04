package acmelab.ta.plugin.exchangerate
uses gw.plugin.exchangerate.IExchangeRateSetPlugin
uses gw.plugin.InitializablePlugin
uses java.util.Map

/**
 * Created with IntelliJ IDEA.
 * User: SMUNOZ
 * Date: 2/01/24
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 */
class AcmeIExchangeRateSetPlugin implements IExchangeRateSetPlugin{
    override function createExchangeRateSet(): ExchangeRateSet {
      // START THE CUT-AND-PASTE HERE
      // Create and initialize new exchange rate set
      var erSet = new ExchangeRateSet()
      erSet.Name = "Lab ExchangeRateSet " + gw.api.util.DateUtil.currentDate()
      erSet.Description = "Lab ExchangeRateSet"
      erSet.MarketRates = true
      erSet.EffectiveDate = gw.api.util.DateUtil.currentDate()
      // Create external web service object and set authentication properties
      var CurrencyAPI = new acme.ta.webservice.currency.exchangeratewsc.currencyapi.CurrencyAPI()
      CurrencyAPI.Config.Http.Authentication.Basic.Username = "su"
      CurrencyAPI.Config.Http.Authentication.Basic.Password = "gw"
      var baseCurrencies = Currency.getTypeKeys(true)
      var priceCurrencies = Currency.getTypeKeys(true)
      // For each base/price currency pair, get exchange rate and add it to set
      for (currentBaseCurrency in baseCurrencies) {
        for (currentPriceCurrency in priceCurrencies) {
          var newExchangeRate = new ExchangeRate()
          newExchangeRate.BaseCurrency = currentBaseCurrency
          newExchangeRate.PriceCurrency = currentPriceCurrency
          newExchangeRate.Rate = CurrencyAPI.getConversionRate(
              currentBaseCurrency as java.lang.String,
                  currentPriceCurrency as java.lang.String)
          erSet.addToExchangeRates(newExchangeRate)
        }
      }
      return erSet
      // END THE CUT-AND-PASTE HERE
    }

   // override function setParameters(parameters: Map<Object,Object>) {
     // var userName = parameters.get("username")
      //var password = parameters.get("password")
     // print("Retrieving currency rates as " + userName + " with password " + password)
   // }
}