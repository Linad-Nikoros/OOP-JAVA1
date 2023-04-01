package org.example.HomeWork1;
public class HotDrink extends Product {
    Integer temperature;
    public HotDrink(String nameProduct, Integer price, Integer temperature) {
        super(nameProduct, price);
        this.temperature = temperature;
    }

}
