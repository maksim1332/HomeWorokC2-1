package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket {
    private List<Product> products;

    public ProductBasket() {
        products = new ArrayList<>();
    }

    public void acceptProduct(Product product) {
        products.add(product);//String title, int price
    }

    public int getTotalCost() {
        return products.stream().mapToInt(Product::getPrice).sum();
    }

    public boolean containsProduct(String productName) {
        return products.stream().anyMatch(product -> product.getTitle().equalsIgnoreCase(productName));
    }

    public void clearBasket() {
        products.clear();
    }

    public void printAllContentBasket() {
        if (products.isEmpty()) {
            System.out.println("В корзине пусто.");
        } else {
            System.out.println("Содержимое корзины:");
            products.forEach(System.out::println);
        }
    }
}

