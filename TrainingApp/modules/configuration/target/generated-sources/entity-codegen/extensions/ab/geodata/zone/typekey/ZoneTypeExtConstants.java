
package extensions.ab.geodata.zone.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.geodata.zone.typekey.ZoneType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ZoneTypeExtConstants {

    /**
     * City
     * City
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_CITY = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "city");
    /**
     * CityKanji
     * CityKanji
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_CITYKANJI = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "citykanji");
    /**
     * Country
     * Country
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_COUNTRY = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "country");
    /**
     * County
     * County
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_COUNTY = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "county");
    /**
     * FSA
     * FSA
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_FSA = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "fsa");
    /**
     * Postal Code
     * PostalCode
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_POSTALCODE = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "postalcode");
    /**
     * Post Code Area
     * Post Code Area
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_POSTCODEAREA = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "postcodearea");
    /**
     * Post Code Region
     * Post Code Region
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_POSTCODEREGION = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "postcoderegion");
    /**
     * Prefecture
     * Prefecture
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_PREFECTURE = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "prefecture");
    /**
     * Province
     * Province
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_PROVINCE = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "province");
    /**
     * State
     * State
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_STATE = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "state");
    /**
     * Unknown
     * Placeholder typecode for fields that should be populated with another ZoneType
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_UNKNOWN = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "unknown");
    /**
     * Zip code
     * Zip code
     * 
     */
    public final static TypeKeyReference<ZoneType> TC_ZIP = new TypeKeyCache<ZoneType>(ZoneType.TYPE, "zip");

}
