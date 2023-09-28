package ru.geekbrains.lesson2.HomeWork2;


public class MainClass {
    public static void main(String[] args) {

        Plate plate = new Plate(100);
        plate.info();

        // Создаю массив котов
        Cat[] cats = {
                new Cat("Barsik", 20, 0),
                new Cat("Persik", 220, 0),
                new Cat("Fedor", 15, 0),
                new Cat("Java", 25, 0),
        };

        //Перебираю котов и вывожу их сытость
        for (Cat cat : cats) {
            cat.eat(cat.getAppetite(), plate.getFood());
            System.out.println(cat.hungry(cat.getAppetite(), plate.getFood()));
        }

        // Метод, с помощью которого можно добавить еду в тарелку
        plate.AddFood(plate.getFood(), 70);





    }


}
