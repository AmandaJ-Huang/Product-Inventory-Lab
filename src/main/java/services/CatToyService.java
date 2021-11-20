package services;

import models.CatToys;

import java.util.ArrayList;
import java.util.List;

public class CatToyService {

    private static int nextId = 1;
    private List<CatToys> inventory = new ArrayList<>();

    public CatToys create(String type, Character size, Double price) {
        CatToys createdCatToys = new CatToys(nextId++, type, size, price);
        inventory.add(createdCatToys);
        return createdCatToys;
    }

    public CatToys findCatToy(Integer id) {
        for (CatToys catToys : inventory) {
            if (catToys.getId().equals(id)) {
                return catToys;
            }
        }
        return null;
    }

    public CatToys[] findAll() {
        return inventory.toArray(new CatToys[0]);
    }

    public Boolean delete(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId().equals(id)) {
                inventory.remove(i);
                return true;
            }
        }
        return false;
    }
}
