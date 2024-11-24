//package org.skypro.skyshop;
//
//public class DiscountedProduct extends Product {
//    private int basePrice;
//    private int discountPercentage;
//
//    public DiscountedProduct(String title, int basePrice, int discountPercentage) {
//        super(title);
//        this.basePrice = basePrice;
//        this.discountPercentage = discountPercentage;
//    }
//    @Override
//    public int getPrice() {
//        return basePrice * (100 - discountPercentage) / 100;
//    }
//}
package org.skypro.skyshop;
import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    private int basePrice; // Базовая цена
    private int discountPercentage; // Скидка

    public DiscountedProduct(String productName, int basePrice, int discountPercentage) {
        super(productName,basePrice);
        this.basePrice = basePrice;
        this.discountPercentage = discountPercentage;
    }
    @Override
    public int getPrice() {
        return basePrice - (basePrice * discountPercentage / 100);
    }
    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return productName + ": " + getPrice();
    }
}
