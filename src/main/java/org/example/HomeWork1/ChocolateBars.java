package org.example.HomeWork1;

public class ChocolateBars extends Product {
    private  Integer weight;
    public ChocolateBars(String nameProduct, Integer price,Integer weight) {
        super(nameProduct, price);
        this.weight = weight;
    }
}
