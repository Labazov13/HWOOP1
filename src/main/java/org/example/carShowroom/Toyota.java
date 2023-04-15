package org.example.carShowroom;

public class Toyota extends Showroom{
    private String type;
    public Toyota(String brand, String model, String color, int cost, int HP, double volumeEngine, String type) {
        super(brand, model, color, cost, HP, volumeEngine);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", применение: " + type;
    }
}
