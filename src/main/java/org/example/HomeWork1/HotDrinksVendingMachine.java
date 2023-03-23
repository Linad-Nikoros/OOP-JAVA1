package org.example.HomeWork1;
import java.util.List;
public class HotDrinksVendingMachine implements VendingMachines{
    private List<HotDrink> hotDrinks;
    public HotDrinksVendingMachine(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }
    @Override
    public String getProduct(String name, Integer volume, Integer temperature) {
         for (HotDrink drink: hotDrinks )
             if(drink.getNameDrink().equals(name)
                 && drink.getVolume().equals(volume)
                 && drink.getTemperature().equals(temperature)) {
                     return drink.getNameDrink();
         }
         return "Товар не найден";
    }
}
