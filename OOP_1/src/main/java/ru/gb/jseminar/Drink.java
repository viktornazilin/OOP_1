package ru.gb.jseminar;

public class Drink extends Product {
    private Double volume;

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Drink(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public String toString() {
        return "Drink{" +
                "name='" + getName() + '\'' +
                ", cost=" + getCost() + '\'' +
                ", volume " + this.volume + '}';

    }
}