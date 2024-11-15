package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private Product[] products;
    private int size;

    public ProductBasket() {
        products = new Product[5]; // или использовать ArrayList для динамичности
    }

    public void acceptProduct(String title, int price) {
        if (size >= products.length) {
            System.out.println("Невозможно добавить продукт");
        } else {
            products[size++] = new Product(title, price);
        }
    }

    public void printAllContentBasket() {
        System.out.println("Содержимое корзины:");
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }
}

