package org.skypro.skyshop.product;

public abstract class Product {
    public final String productName ;


    public Product(String productName, int price ){
        this.productName = productName;

    }

    public String getProductName() {
        return productName;
    }
    public abstract int getPrice();
    public abstract boolean isSpecial();

    @Override
    public String toString() {
        return productName + '=' + getPrice() ;
    }

}


