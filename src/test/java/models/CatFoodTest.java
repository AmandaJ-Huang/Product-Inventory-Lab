package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CatFoodTest {
    private CatFood testCatFood = new CatFood();
    private CatFood friskies = new CatFood(123, "Friskies", "dry", 10, 3, 30.00);

    @Test
    public void setBrandTest() {
        //Given
        String expected = "Fancy Feast";

        //When
        testCatFood.setBrand(expected);
        String actual = testCatFood.getBrand();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTypeTest() {
        //Given
        String expected = "dry";

        //When
        testCatFood.setType(expected);
        String actual = testCatFood.getType();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setWeightTest() {
        //Given
        Float expected = 5.2f;

        //When
        testCatFood.setWeight(expected);
        Float actual = testCatFood.getWeight();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setQtyTest() {
        //Given
        Integer expected = 100;

        //When
        testCatFood.setQty(expected);
        Integer actual = testCatFood.getQty();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPriceTest() {
        //Given
        Double expected = 3.50;

        //When
        testCatFood.setPrice(expected);
        Double actual = testCatFood.getPrice();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIdTest() {
        //Given
        Integer expected = 12345;

        //When
        testCatFood.setId(expected);
        Integer actual = testCatFood.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        //Given
        int expectedId = 123;
        String expectedBrand = "Friskies";
        String expectedType = "dry";
        float expectedWeight = 10;
        int expectedQty = 3;
        Double expectedPrice = 30.00;

        //When
        CatFood testFood = new CatFood(expectedId, expectedBrand, expectedType,
                expectedWeight, expectedQty, expectedPrice);
        int actualId = testFood.getId();
        String actualBrand = testFood.getBrand();
        String actualType = testFood.getType();
        float actualWeight = testFood.getWeight();
        int actualQty = testFood.getQty();
        Double actualPrice = testFood.getPrice();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedType, actualType);
        Assertions.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
