
package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        ProductBasket productBasket = new ProductBasket();

        System.out.println("Добавление продукта в корзину");
        productBasket.acceptProduct("Яблоки", 50);
        productBasket.printAllContentBasket();
    }
}
