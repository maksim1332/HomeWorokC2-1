//package org.skypro.skyshop.product;
//
//public abstract class Product {
//    final String title;
//    final int price;
//
//    public Product(String title, int price) {
//        this.title = title;
//        this.price = price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public abstract int getPrice() {
//        return price;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "title='" + title + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}
package org.skypro.skyshop.product;

public abstract class Product {
    public final String productName ;
    protected    int price;

    public Product(String productName, int price ){
        this.productName = productName;
        this.price = price;
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


