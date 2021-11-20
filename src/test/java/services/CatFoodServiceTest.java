package services;

import models.CatFood;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatFoodServiceTest {

    @Test
    public void createTest() {
        //Given
        String expectedBrand = "FancyFeast";
        String expectedType = "gravy";
        float expectedWeight = 4;
        int expectedQty = 24;
        Double expectedPrice = 18.00;

        //When
        CatFoodService catFoodService = new CatFoodService();
        CatFood testCatFood = catFoodService.create(expectedBrand, expectedType,
                expectedWeight, expectedQty, expectedPrice);

        String actualBrand = testCatFood.getBrand();
        String actualType = testCatFood.getType();
        float actualWeight = testCatFood.getWeight();
        int actualQty = testCatFood.getQty();
        Double actualPrice = testCatFood.getPrice();

        //Then
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedType, actualType);
        Assertions.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
