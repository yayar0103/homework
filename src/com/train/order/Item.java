package com.train.order;

public class Item {
    private String id;
    private String name;
    private String calorie;
    private String price;

    public Item(String id, String name, String calorie, String price){
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", calorie='" + calorie + '\'' +
                ", price='" + price + '\'';
    }
}
