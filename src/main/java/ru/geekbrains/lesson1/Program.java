package ru.geekbrains.lesson1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник","Бутылка с водой (1)", 200);
//        product1.name = "Бутылка с водой (1)";
//        product1.brand = "ООО Источник";


        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Бутылка с водой (3)", 150);
        System.out.println(product3.displayInfo());

        Product bottleOfWater =
                new BottleOfWater("ООО Источник", "Бутылка с водой (4)", 250, 1.5);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("ООО Источник","Бутылка с водой (4)", 310, 0.5,15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 =
                new BottleOfMilk("ООО Источник","Бутылка с водой (2)", 330, 1.5,15);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfMilk3 =
                new BottleOfMilk("ООО Источник","Бутылка с водой (3)", 340, 2.5,35);
        System.out.println(bottleOfMilk3.displayInfo());

        Product bottleOfMilk4 =
                new BottleOfMilk("ООО Источник","Бутылка с водой (4)", 350, 1.5,25);
        System.out.println(bottleOfMilk4.displayInfo());

        Product chips1 = new Chips("ООО Lays", "Chips (1)", 140, "Солёные", "Рифлёные");
        System.out.println(chips1.displayInfo());

        Product chips2 = new Chips("ООО Lays", "Chips (1)", 110, "С беконом", "Обычные");
        System.out.println(chips2.displayInfo());


        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(chips1);
        products.add(chips2);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfMilk bottle = vendingMachine.getBottleofMilk(1.5,15);
        if (bottle == null) {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(bottle.displayInfo());
        }

        System.out.println("-".repeat(bottle.displayInfo().length()));

        Chips chip = vendingMachine.getChips("Солёные","Рифлёные");
        if (chip == null) {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(chip.displayInfo());
        }

        System.out.println("-".repeat(chip.displayInfo().length()));

        Product hotDrink1 = new HotDrink("OOO Nescafe", "Капучино", 200, 70, 200);
        System.out.println(hotDrink1.displayInfo());

        Product hotDrink2 = new HotDrink("OOO Nescafe", "Латте", 250, 70, 300);
        System.out.println(hotDrink2.displayInfo());

        Product hotDrink3 = new HotDrink("OOO Lipton", "Чёрный чай", 110, 90, 300);
        System.out.println(hotDrink3.displayInfo());

        Product hotDrink4 = new HotDrink("OOO Lipton", "Зелёный чай", 100, 90, 300);
        System.out.println(hotDrink4.displayInfo());

        ArrayList<Product> hotDrink = new ArrayList<>();
        hotDrink.add(hotDrink1);
        hotDrink.add(hotDrink2);
        hotDrink.add(hotDrink3);
        hotDrink.add(hotDrink4);

        System.out.println("-".repeat(85));

        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine(hotDrink);

        HotDrink drink = hotDrinksVendingMachine.getHotDrink("Латте", 300, 70);
        if (drink == null) {
            System.out.println("Такого напитка нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(drink.displayInfo());
        }



    }
}
