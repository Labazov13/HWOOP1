package org.example.carShowroom;

import static org.example.carShowroom.ListCars.countMoney;

public class Main {
    public static void main(String[] args) {
        ListCars listCars = new ListCars();
        listCars.addCar(new Showroom("Lamborgini", "Gallardo", "orange", 200000, 600, 6.0))
                .addCar(new Showroom("Lamborgini", "Murcelago", "gray", 250000, 700, 7.0))
                .addCar(new Toyota("Toyota", "Land cruiser", "black", 40000, 249, 3.0, "all-road"))
                .addCar(new Toyota("Toyota", "Camry", "white", 35000, 192, 3.5, "city drive"));
        listCars.showAllCars(listCars.getList());
        Showroom findCar = listCars.findCar();
        listCars.sellCar(findCar);
        listCars.showAllCars(listCars.getList());
        countMoney(listCars);
    }
}
