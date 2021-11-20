package services;

import models.CatFood;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatFoodServiceTest {
    private CatFoodService catFoodService = new CatFoodService();

    @Test
    public void createTest() {
        //Given
        String expectedBrand = "FancyFeast";
        String expectedType = "gravy";
        float expectedWeight = 4;
        int expectedQty = 24;
        Double expectedPrice = 18.00;

        //When
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

    @Test
    public void findCatFoodTest() {
        //Given
        Integer expectedId = 1;
        String expectedBrand = "FancyFeast";
        String expectedType = "gravy";
        float expectedWeight = 4;
        int expectedQty = 24;
        Double expectedPrice = 18.00;

        //When
        CatFood testCatFood = catFoodService.create(expectedBrand, expectedType,
                expectedWeight, expectedQty, expectedPrice);
        CatFood actual = catFoodService.findCatFood(expectedId);

        //Then
        Assert.assertEquals(testCatFood, actual);
    }

    @Test
    public void findAllTest() {
        //Given
        CatFood purinaFood = catFoodService.create("purina", "wet",
                2.5f, 12, 12.00);
        CatFood friskiesFood = catFoodService.create("friskies", "dry",
                1.8f, 36, 21.00);
        CatFood iamsFood = catFoodService.create("iams", "grain-free dry",
                12.4f, 1, 35.50);

        CatFood[] expected = {purinaFood, friskiesFood, iamsFood};

        //When
        CatFood[] actual = catFoodService.findAll();

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    //Why does test not pass when all tests are run? Garbage collection?
    @Test
    public void deleteTest() {
        //Given
        CatFood purinaFood = catFoodService.create("purina", "wet",
                2.5f, 12, 12.00);
        CatFood friskiesFood = catFoodService.create("friskies", "dry",
                1.8f, 36, 21.00);
        CatFood iamsFood = catFoodService.create("iams", "grain-free dry",
                12.4f, 1, 35.50);

        int id = 2;
        Boolean expected = true;

        //When
        Boolean actual = catFoodService.delete(1);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
