package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products;
    private int count;

    public ProductBasket() {
        products = new Product[5];
        count = 0;
    }

    public void acceptProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Корзина заполнена, не удалось добавить продукт: " + product.getTitle());
        }
    }

    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public boolean containsProduct(String productName) {
        for (int i = 0; i < count; i++) {
            if (products[i].getTitle().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        products = new Product[5];
        count = 0;
    }

    public void printAllContentBasket() {
        if (count == 0) {
            System.out.println("В корзине пусто.");
        } else {
            System.out.println("Содержимое корзины:");
            for (int i = 0; i < count; i++) {
                System.out.println(products[i]);
            }
        }
    }
}
