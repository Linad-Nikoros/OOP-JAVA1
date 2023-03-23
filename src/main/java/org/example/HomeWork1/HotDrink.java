package org.example.HomeWork1;
public class HotDrink extends Drink {
    Integer temperature;
    public HotDrink(String nameDrink, Integer price, Integer volume,  Integer temperature) {
        super(nameDrink, price, volume);
        this.temperature = temperature;
    }
    public Integer getTemperature() {
        return  temperature;
    }
}
