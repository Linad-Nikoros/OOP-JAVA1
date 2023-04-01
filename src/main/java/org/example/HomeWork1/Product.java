package org.example.HomeWork1;

public class Product {
    private  String nameProduct;
    private  Integer price;
    public Product(String nameProduct, Integer price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }
    public String getNameProduct() {
        return nameProduct;
    }
    public Integer getPrice() {
        return price;
    }
}
