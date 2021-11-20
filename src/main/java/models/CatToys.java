package models;

public class CatToys {
    private int id;
    private String type;
    private Character size;
    private double price;

    public CatToys() {

    }

    public CatToys(Integer id, String type, Character size, Double price) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setSize(Character size) {
        this.size = size;
    }

    public Character getSize() {
        return this.size;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }
}
