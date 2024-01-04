package acmelab.ta.classes
/**
 * Created with IntelliJ IDEA.
 * User: SMUNOZ
 * Date: 20/12/23
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */
class AddressCleanupUtil {
    public static function AddressCleanup(addresses : entity.Address[]) : void{
      for(address in addresses){
        if(address.AddressLine1 != null){
            var addressLine = address.AddressLine1

          addressLine = replaceStreetAbbr(addressLine)
          address.AddressLine1 = addressLine
        }
      }
    }
  private  static function replaceStreetAbbr(addressLine : String) : String{
    if (addressLine.endsWith(" Ave")) {
      addressLine = addressLine.replace(" Ave", " Avenue")
    }
    if (addressLine.endsWith(" Ave.")) {
      addressLine =  addressLine.replace(" Ave.", " Avenue")
    }
    if (addressLine.endsWith(" St")) {
      addressLine = addressLine.replace(" St", " Street")
    }
    if (addressLine.endsWith(" St.")) {
      addressLine = addressLine.replace(" St.", " Street")
    }
    if (addressLine.endsWith(" Str.")) {
      addressLine = addressLine.replace(" Str.", " Street")
    }
    if (addressLine.endsWith(" Str")) {
      addressLine = addressLine.replace(" Str", " Street")
    }
    return addressLine
  }

}