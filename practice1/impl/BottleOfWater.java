package practice1.impl;

import java.time.LocalDate;

import practice1.Product;

public class BottleOfWater extends Product {
    private float volume;
    private String pack;
    private boolean isSparkling;

    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.volume = 1;
        this.pack = Package.PLASTIC.getMaterial();
        this.isSparkling = false;
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, float volume, String pack,
            boolean isSparkling) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.pack = pack;
        this.isSparkling = isSparkling;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    @Override
    public String toString() {
        return "Product {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", volume=" + volume +
                ", pack=" + pack +
                ", isSparkling=" + isSparkling +
                '}';
    }

}
