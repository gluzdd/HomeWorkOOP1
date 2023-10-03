package ru.geekbrains.lesson1;

import java.util.List;

public class HotDrinksVendingMachine {

    private List<Product> drink;

    public HotDrinksVendingMachine(List<Product> Drink) {
        this.drink = Drink;
    }

    public HotDrink getHotDrink(String name, int volume, int temperature) {
        for (Product Drink : drink) {
            if (Drink instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) Drink;
                if (hotDrink.getName() == name && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                    return hotDrink;
                }
            }
        }
        return null;
    }



}
