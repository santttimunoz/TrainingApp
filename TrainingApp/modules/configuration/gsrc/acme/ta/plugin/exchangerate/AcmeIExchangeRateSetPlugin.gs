package acme.ta.plugin.exchangerate

uses gw.plugin.exchangerate.IExchangeRateSetPlugin
uses gw.api.system.database.SequenceUtil

class AcmeIExchangeRateSetPlugin implements IExchangeRateSetPlugin {
  public override function createExchangeRateSet(): ExchangeRateSet {
    // START THE CUT-AND-PASTE HERE
        var erSet = new ExchangeRateSet()
        return erSet
    // END THE CUT-AND-PASTE HERE
  }
}
