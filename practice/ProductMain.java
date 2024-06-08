package practice;

import java.time.LocalDate;
import java.util.List;

// import practice.impl.BottleOfWater;
import practice.impl.HotDrink;
import practice.impl.HotDrinkVendingMachine;
// import practice.impl.Package;
// import practice.impl.WaterVendingMachine;

public class ProductMain {
    public static void main(String[] args) {
        // Product bottle1 = new BottleOfWater("Water", 55, LocalDate.of(2024, 5, 1));

        // Product bottle2 = new BottleOfWater("Water Sparkling", 55, LocalDate.of(2024,
        // 5, 1), 0.5F,
        // Package.GLASS.getMaterial(),
        // true);

        // VendingMachine vm = new WaterVendingMachine();

        // System.out.println(vm.getProducts());
        // System.out.println();

        // vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2,
        // bottle2));

        // System.out.println(vm.getProducts());
        // System.out.println();

        // vm.getProduct("Water");
        // System.out.println(vm.getProducts());

        VendingMachine hdMachine = new HotDrinkVendingMachine();
        System.out.println(hdMachine.getProducts());
        System.out.println();

        HotDrink coffee = new HotDrink("coffee", 10, LocalDate.of(2024, 5, 1), 90);

        HotDrink tea = new HotDrink("tea", 7, LocalDate.of(2024, 5, 20), 80);

        HotDrink cocoa = new HotDrink("cocoa", 8, LocalDate.of(2024, 5, 25), 85);

        hdMachine.addProducts(List.of(coffee, tea, cocoa));

        System.out.println(hdMachine.getProducts());

    }
}