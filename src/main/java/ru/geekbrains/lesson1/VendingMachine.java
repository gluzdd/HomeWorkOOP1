package ru.geekbrains.lesson1;

import java.util.List;
import java.util.Objects;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleofMilk(double volume, int fat) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat) {
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public Chips getChips(String taste, String form) {
        for (Product product : products) {
            if (product instanceof Chips) {
                Chips chips = (Chips) product;
                if (Objects.equals(chips.getTaste(), taste) && Objects.equals(chips.getForm(), form)) {
                    return chips;
                }
            }
        }
        return null;
    }
}
