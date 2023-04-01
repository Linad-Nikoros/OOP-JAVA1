package org.example.HomeWork1;
public class Drink extends Product{
    Integer  volume;
    public Drink(String nameProduct, Integer price, Integer volume) {
        super(nameProduct, price);
        this.volume = volume;
    }

}
