package edu.services.places.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaceTypeTests
{
    @Test
    void testConstructorAndGetters()
    {
        final PlaceType placeType = new PlaceType(1L, "museum");

        Assertions.assertEquals(1L, placeType.getId());
        Assertions.assertEquals("museum", placeType.getTitle());
    }

    @Test
    void testDefaultConstructorAndSetters()
    {
        final PlaceType placeType = new PlaceType();
        placeType.setId(2L);
        placeType.setTitle("park");

        Assertions.assertEquals(2L, placeType.getId());
        Assertions.assertEquals("park", placeType.getTitle());
    }

    @Test
    void testEqualsWithSameValues()
    {
        final PlaceType a = new PlaceType(1L, "museum");
        final PlaceType b = new PlaceType(1L, "museum");

        Assertions.assertEquals(a, b);
    }

    @Test
    void testEqualsWithDifferentValues()
    {
        final PlaceType a = new PlaceType(1L, "museum");
        final PlaceType b = new PlaceType(2L, "park");

        Assertions.assertNotEquals(a, b);
    }

    @Test
    void testEqualsWithNull()
    {
        final PlaceType placeType = new PlaceType(1L, "museum");

        Assertions.assertNotEquals(null, placeType);
    }

    @Test
    void testEqualsWithDifferentClass()
    {
        final PlaceType placeType = new PlaceType(1L, "museum");

        Assertions.assertNotEquals("museum", placeType);
    }

    @Test
    void testHashCode()
    {
        final PlaceType a = new PlaceType(1L, "museum");
        final PlaceType b = new PlaceType(1L, "museum");

        Assertions.assertEquals(a.hashCode(), b.hashCode());
    }
}