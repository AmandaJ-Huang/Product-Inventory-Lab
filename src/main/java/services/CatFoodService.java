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

    public CatFood findCatFood(int id) {
        for (CatFood catFood : inventory) {
            if (catFood.getId().equals(id)) {
                return catFood;
            }
        }
        return null;
    }

    public CatFood[] findAll() {
        return inventory.toArray(new CatFood[0]);
    }

    public Boolean delete(int id) {
        for (CatFood catFood : inventory) {
            if (catFood.getId().equals(id)) {
                inventory.remove(catFood);
                return true;
            }
        }
        return false;
    }
}
