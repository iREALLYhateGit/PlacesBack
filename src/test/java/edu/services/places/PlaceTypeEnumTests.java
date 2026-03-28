package edu.services.places;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaceTypeEnumTests
{
    @Test
    void testGetValue()
    {
        Assertions.assertEquals("cathedral", PlaceTypeEnum.CATHEDRAL.getValue());
        Assertions.assertEquals("church", PlaceTypeEnum.CHURCH.getValue());
        Assertions.assertEquals("museum", PlaceTypeEnum.MUSEUM.getValue());
        Assertions.assertEquals("theatre", PlaceTypeEnum.THEATRE.getValue());
        Assertions.assertEquals("park", PlaceTypeEnum.PARK.getValue());
        Assertions.assertEquals("garden", PlaceTypeEnum.GARDEN.getValue());
        Assertions.assertEquals("palace", PlaceTypeEnum.PALACE.getValue());
        Assertions.assertEquals("bridge", PlaceTypeEnum.BRIDGE.getValue());
        Assertions.assertEquals("monument", PlaceTypeEnum.MONUMENT.getValue());
        Assertions.assertEquals("embankment", PlaceTypeEnum.EMBANKMENT.getValue());
        Assertions.assertEquals("viewpoint", PlaceTypeEnum.VIEWPOINT.getValue());
        Assertions.assertEquals("street", PlaceTypeEnum.STREET.getValue());
        Assertions.assertEquals("cafe", PlaceTypeEnum.CAFE.getValue());
        Assertions.assertEquals("restaurant", PlaceTypeEnum.RESTAURANT.getValue());
        Assertions.assertEquals("bar", PlaceTypeEnum.BAR.getValue());
        Assertions.assertEquals("other", PlaceTypeEnum.OTHER.getValue());
    }
}