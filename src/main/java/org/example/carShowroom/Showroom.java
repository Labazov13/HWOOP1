package org.example.carShowroom;

public class Showroom {
    private String brand;
    private String model;
    private String color;
    private int cost;
    private int HP;
    private double volumeEngine;

    public Showroom(String brand, String model, String color, int cost, int HP, double volumeEngine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.cost = cost;
        this.HP = HP;
        this.volumeEngine = volumeEngine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: "
                + model + ", цвет: " + color + ", цена: "
                + cost + ", мощность: " + HP + ", объем двигателя: "
                + volumeEngine;
    }
}
