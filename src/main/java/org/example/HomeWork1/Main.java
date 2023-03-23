package org.example.HomeWork1;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine hotDrinkVenMach = new HotDrinksVendingMachine(Arrays.asList(
        new  HotDrink("greenTea", 40, 300, 60),
        new  HotDrink("blackTea", 40, 250, 55),
        new  HotDrink("coffee", 65, 200, 90)));

        System.out.println(hotDrinkVenMach.getProduct("greenTea",300,60));
    }
}
