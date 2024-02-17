package com.example.myapplication;

public class FoodItem {
    private int id;
    private String name;
    private String description;
    private double price;
    private byte[] imageData; // Byte array to store image data

    public FoodItem(String name, String description, double price, byte[] imageData) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageData = imageData;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
}
