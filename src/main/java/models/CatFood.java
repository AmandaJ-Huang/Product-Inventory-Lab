package models;

public class CatFood {
    private int id;
    private String brand;
    private String type;
    private int weight;
    private int qty;
    private double price;

    public CatFood() {

    }

    public CatFood(int id, String brand, String type, int weight, int qty, double price) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.qty = qty;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getQty() {
        return this.qty;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }
}
