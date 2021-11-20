package services;

import models.CatToys;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatToyServiceTest {
    CatToyService catToyService = new CatToyService();

    @Test
    public void createTest() {
        //Given
        String expectedType = "springs";
        Character expectedSize = 'M';
        Double expectedPrice = 3.48;

        //When
        CatToys testCatToys = catToyService.create(expectedType, expectedSize, expectedPrice);
        String actualType = testCatToys.getType();
        Character actualSize = testCatToys.getSize();
        Double actualPrice = testCatToys.getPrice();

        //Then
        Assert.assertEquals(expectedType, actualType);
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void findCatToyTest() {
        //Given
        Integer expectedId = 2;

        //When
        CatToys testCatToy = catToyService.create("tracks", 'M', 8.79);
        CatToys testCatToy1 = catToyService.create("mouse", 'S', 1.50);
        CatToys actual = catToyService.findCatToy(expectedId);

        //Then
        Assert.assertEquals(testCatToy1, actual);
    }

    @Test
    public void findAllTest() {
        //Given
        CatToys tracksToy = catToyService.create("tracks", 'M', 8.79);
        CatToys mouseToy = catToyService.create("mouse", 'S', 1.50);

        CatToys[] expected = {tracksToy, mouseToy};

        //When
        CatToys[] actual = catToyService.findAll();

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void deleteTest() {
        //Given
        CatToys tracksToy = catToyService.create("tracks", 'M', 8.79);
        CatToys mouseToy = catToyService.create("mouse", 'S', 1.50);

        int id = 1;
        Boolean expected = true;

        //When
        Boolean actual = catToyService.delete(id);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
