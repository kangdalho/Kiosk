package com.example.kiosk;

public class MenuItem {

    private String name;
    private String price;
    private String description;
    private String category;

    MenuItem(String name, String price, String explain, String category) {
        this.name = name;
        this.price = price;
        this.description = explain;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory(){
        return category;
    }

    public String toString() {
        return name + " | " + price + " | " + description;
    }
}



