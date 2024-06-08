package practice.impl;

import java.time.LocalDate;

import practice.Product;

public class HotDrink extends Product {
    private int temp;
    private float volume;

    public HotDrink(String name, double price, LocalDate releaseDate, int temp) {
        super(name, price, releaseDate);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink [name=" + name + ", price=" + price + ", temp=" + temp + ", releaseDate=" + releaseDate
                + ", volume=" + volume + "]";
    }

}
