package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class App {

    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        basket.addProduct(new SimpleProduct("Яблоки",100));
        basket.addProduct(new SimpleProduct("Бананы", 200));
        basket.addProduct(new SimpleProduct("Персики", 150));
        basket.addProduct(new SimpleProduct("Сливы", 100));
        basket.addProduct(new SimpleProduct("Груши", 150));

        basket.countingSpecialItems();
        System.out.println("Общая стоимость корзины: " + basket.calculateBasketCost() + " рублей");


        basket.containsProduct("Картофель");
        basket.containsProduct("Молоко");

        System.out.println("Общая стоимость корзины: " + basket.calculateBasketCost() + " рублей.");
        basket.containsProduct("Рыба");

        ProductBasket basket1 = new ProductBasket();

        basket1.addProduct(new SimpleProduct("Помидоры", 100));
        basket1.addProduct(new SimpleProduct("Огурцы", 50));
        basket1.addProduct(new SimpleProduct("Лук", 45));
        basket1.addProduct(new DiscountedProduct("Майонез", 120,10));
        basket1.addProduct(new SimpleProduct("Соль", 30));

        basket1.countingSpecialItems();
        System.out.println("Общая стоимость корзины: " + basket1.calculateBasketCost() + " рублей.");

        basket1.addProduct(new SimpleProduct("Петрушка", 100));

        basket1.clearBasket();


    }

}


