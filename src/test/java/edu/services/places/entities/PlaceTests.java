package edu.services.places.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaceTests
{
    private Place buildPlace()
    {
        final Place place = new Place();
        place.setId(1L);
        place.setTitle("Isaac cathedral");
        place.setType(new PlaceType(1L, "cathedral"));
        place.setAddress("Nevsky prospekt");
        place.setArchitect("Montferrand");
        place.setPopularityScore(5);
        place.setDescription("Famous cathedral");
        return place;
    }

    @Test
    void testSetPopularityScoreValid()
    {
        final Place place = new Place();

        Assertions.assertTrue(place.setPopularityScore(1));
        Assertions.assertTrue(place.setPopularityScore(3));
        Assertions.assertTrue(place.setPopularityScore(5));
    }

    @Test
    void testSetPopularityScoreInvalid()
    {
        final Place place = new Place();

        Assertions.assertFalse(place.setPopularityScore(0));
        Assertions.assertFalse(place.setPopularityScore(6));
        Assertions.assertFalse(place.setPopularityScore(-1));
    }

    @Test
    void testIsSetFlags()
    {
        final Place place = buildPlace();

        Assertions.assertTrue(place.isIdSet());
        Assertions.assertTrue(place.isTitleSet());
        Assertions.assertTrue(place.isTypeSet());
        Assertions.assertTrue(place.isAddressSet());
        Assertions.assertTrue(place.isArchitectSet());
        Assertions.assertTrue(place.isPopularityScoreSet());
        Assertions.assertTrue(place.isDescriptionSet());
    }

    @Test
    void testEqualsWithSameValues()
    {
        final Place a = buildPlace();
        final Place b = buildPlace();

        Assertions.assertEquals(a, b);
    }

    @Test
    void testEqualsWithNull()
    {
        final Place place = buildPlace();

        Assertions.assertNotEquals(null, place);
    }

    @Test
    void testEqualsWithDifferentClass()
    {
        final Place place = buildPlace();

        Assertions.assertNotEquals("string", place);
    }

    @Test
    void testHashCode()
    {
        final Place a = buildPlace();
        final Place b = buildPlace();

        Assertions.assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void testToString()
    {
        final Place place = buildPlace();
        final String result = place.toString();

        Assertions.assertTrue(result.contains("Isaac cathedral"));
        Assertions.assertTrue(result.contains("Nevsky prospekt"));
    }
}