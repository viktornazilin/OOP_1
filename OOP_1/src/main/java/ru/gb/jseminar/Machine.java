package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    private final List<Product> list;
    public Machine(List<Product> list){
        this.list = list;
    }
    public Product getProdictByName(String name){
        for (Product item:this.list) {
            if(name.equals(item.getName())){
                return item;
            }
        }
        throw new IllegalStateException();
    }
    public HotDrink getProdictByName(String name, double volume, int temperature){
        for (Product item:this.list) {
            if(item instanceof HotDrink){
                if(item.getName().equalsIgnoreCase(name) &&
                        ((HotDrink) item).getVolume() == volume &&
                        ((HotDrink) item).getTemperatur() == temperature){
                return (HotDrink) item;
                }
            }
            }
        throw new IllegalStateException();
    }
}