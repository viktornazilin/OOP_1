package ru.gb.jseminar;

public class HotDrink extends Drink{
    private int temperature;

    public int getTemperatur() {
        return temperature;
    }

    public void setTemperatur(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(String name, Double cost, Double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + getName() + '\'' +
                ", volume=" + getVolume() + '\'' +
                ", temperatur " + this.temperature + '}';
    }
}