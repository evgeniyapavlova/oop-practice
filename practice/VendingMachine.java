package practice;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                Product result = product;
                products.remove(product);
                return result;
            }
        }

        System.out.println("No product: " + name);
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

}
