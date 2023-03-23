package org.example.HomeWork1;
public class Drink {
    String nameDrink;
    Integer price;
    Integer  volume;
    public Drink(String nameDrink, int price, int volume) {
        this.nameDrink = nameDrink;
        this.volume = volume;
        this.price = price;
    }
    public  String getNameDrink() {
        return nameDrink;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getVolume() {
        return volume;
    }

}
