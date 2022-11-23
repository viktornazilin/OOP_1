package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(Arrays.asList(
                new Product("Chips", 1.5),
                new Product("Chocolate", 10.1)));
        Machine machine = new Machine(list);
        String key = "Chips";
        System.out.println((machine.getProdictByName(key)));
        List<Product> listDrink  = new ArrayList<>(Arrays.asList(
                new Drink("Budweiser", 0.99,0.5),
                new Drink("Radeberger", 0.99,0.5)));
        Machine bottlemachine = new DrinkMachine(listDrink);
        System.out.println(bottlemachine.getProdictByName("Budweiser"));
        List<Product> listHotDrink = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffee", 5.0, 0.2, 50),
                new HotDrink("Tea", 4.0, 0.2, 50),
                new HotDrink("HotChocolate", 4.5, 0.2, 70)));
        Machine hotDrinkMachine = new HotDrinkMachine(listHotDrink);
        System.out.println(hotDrinkMachine.getProdictByName("Coffee", 0.2,  50));
    }
}