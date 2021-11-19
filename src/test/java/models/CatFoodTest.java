package models;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CatFoodTest {
    private CatFood testCatFood = new CatFood();

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
        Integer expected = 5;

        //When
        testCatFood.setWeight(expected);
        Integer actual = testCatFood.getWeight();

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
}
