package org.example;

public class Cofee extends Product{
    private String strength;
    public Cofee(String name, Integer cost, String strength) {
        super(name, cost);
        this.strength = strength;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + strength;
    }
}
