package practice.impl;

import java.util.ArrayList;
import java.util.List;

import practice.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine {

    private List<HotDrink> products = new ArrayList<>();

    public HotDrink getProduct(String name, double volume, int temp) {

        for (HotDrink product : products) {
            if (product
                    .getName()
                    .equals(name)
                    &&
                    product.getVolume() == volume
                    &&
                    product.getTemp() == temp) {
                HotDrink result = product;
                products.remove(product);
                return result;
            }
        }

        System.out.println("No product: " + name);
        return null;
    }

}
