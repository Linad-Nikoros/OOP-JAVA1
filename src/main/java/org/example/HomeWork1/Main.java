package org.example.HomeWork1;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        VendingMachine VenMach = new VendingMachine(List.of(
                new Drink("greenTea", 40, 300),
                new Drink("blackTea", 40, 250),
                new HotDrink("coffee", 65, 200),
                new ChocolateBars("Mars", 65, 100)));
        System.out.println(VenMach.getProduct("greenTea",40));
    }
}
