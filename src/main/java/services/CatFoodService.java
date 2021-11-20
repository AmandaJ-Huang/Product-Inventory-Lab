package services;

import models.CatFood;

import java.util.ArrayList;
import java.util.List;

public class CatFoodService {

    private static int nextId = 1;
    private List<CatFood> inventory = new ArrayList<>();

    public CatFood create(String brand, String type,
                          float weight, int qty, Double price) {
        //make new CatFood instance and pass values received from constructor
        CatFood createdCatFood = new CatFood(nextId++, brand, type, weight, qty, price);

        //add new CatFood to ArrayList
        inventory.add(createdCatFood);

        //return new object to caller
        return createdCatFood;
    }
}
