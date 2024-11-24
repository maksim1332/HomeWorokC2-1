//package org.skypro.skyshop;
//
//public class SimpleProduct extends Product{
//    private int price;
//
//    public SimpleProduct(String title,int price){
//        super(title);
//        this.price = price;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//}
package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

class SimpleProduct extends Product {
    private int price;


    public SimpleProduct(String productName, int price) {
        super(productName,price);
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

}

