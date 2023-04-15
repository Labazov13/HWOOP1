package org.example.carShowroom;
import org.example.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCars {
    List <Showroom> listCars = new ArrayList<>();
    private int amount = 0;

    public int getAmount() {
        return amount;
    }

    /***
     * Добавляет новый автомобиль с вписок
     * @param car
     * @return
     */
    public ListCars addCar(Showroom car){
        listCars.add(car);
        return this;
    }
    public List<Showroom> getList() {
        return listCars;
    }

    /***
     * Отображает весь список авто в продаже
     * @param listCars
     */
    public void showAllCars(List <Showroom> listCars){
        System.out.println("В продаже сейчас: ");
        for(Showroom car : listCars){
            System.out.println(car);
        }
    }

    /***
     * Метод ищет требуемый авто в списке продаваемых
     *
     */
    public Showroom findCar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите модель авто: ");
        String find = sc.next().toLowerCase();
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getModel().toLowerCase().equals(find)) {
                System.out.println(getList().get(i));
                return getList().get(i);
            }
        }
        return null;
    }

    /***
     * Метод находит авто в списке и продает его, прибавляя его стоимость в кассу
     * @param findCar
     * @return
     */
    public Showroom sellCar(Showroom findCar) {
        try {
            getList().remove(findCar);
            amount += findCar.getCost();
            System.out.println("Продан авто " + findCar);
            return findCar;
        } catch (Exception e) {
            throw new RuntimeException("Not found");
        }
    }

    /***
     * Отображает текущий баланс
     * @param list
     */
    public static void countMoney(ListCars list){
        System.out.println("Текущий баланс: " + list.getAmount());
    }
}
