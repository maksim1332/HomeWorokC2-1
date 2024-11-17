package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        Product apple = new Product("Яблоки", 50);
        Product banana = new Product("Бананы", 80);
        Product peaches = new Product("Персики", 90);

        basket.acceptProduct(apple);
        basket.acceptProduct(banana);
        basket.acceptProduct(peaches);

        System.out.println("Общая стоимость: " + basket.getTotalCost());

        basket.printAllContentBasket();

        System.out.println("Содержит ли корзина яблоки? " + basket.containsProduct("Apple"));

        basket.clearBasket();
        basket.printAllContentBasket();
    }
}

