package org.example;

public class Bread extends Product {
    private String color;

    public Bread(String name, Integer cost, String color) {
        super(name, cost);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " " + color;
    }

}
