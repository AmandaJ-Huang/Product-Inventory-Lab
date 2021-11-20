package models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CatToysTest {
    CatToys testCatToys = new CatToys();

    @Test
    public void setIdTest() {
        //Given
        Integer expected = 28697;

        //When
        testCatToys.setId(expected);
        Integer actual = testCatToys.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTypeTest() {
        //Given
        String expected = "teaser";

        //When
        testCatToys.setType(expected);
        String actual = testCatToys.getType();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSizeTest() {
        //Given
        Character expected = 'S';

        //When
        testCatToys.setSize(expected);
        Character actual = testCatToys.getSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPriceTest() {
        //Given
        Double expected = 4.99;

        //When
        testCatToys.setPrice(expected);
        Double actual = testCatToys.getPrice();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        //Given
        Integer expectedId = 9375;
        String expectedType = "springs";
        Character expectedSize = 'M';
        Double expectedPrice = 3.48;

        //When
        CatToys friscoSprings = new CatToys(expectedId, expectedType, expectedSize, expectedPrice);
        Integer actualId = friscoSprings.getId();
        String actualType = friscoSprings.getType();
        Character actualSize = friscoSprings.getSize();
        Double actualPrice = friscoSprings.getPrice();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedType, actualType);
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
