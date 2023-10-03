package ru.geekbrains.lesson3;

public class Task1 {



    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 300, 200);
        Cat cat2 = new Cat("Персик", 300, 200);

        System.out.println(cat1);
        System.out.println(cat2);

        Animal[] animals = {
                new Cat("Барсик", 300, 200),
                new Dog("Быстрый", 500, 20),
                new Dog("Тузик", 1000, 15),
                new Dog("Шарик", 800, 30),
                new Dog("Бима", 500, 50),
        };

        for (Animal a : animals) {
            a.run(200);
            a.run(10);
            a.run(500);
            a.run(15);
            a.run(1000);
            a.run(30);
        }

        System.out.println();

        System.out.println("Было создано " + Cat.getCounter() + " котиков.");
        System.out.println("Было создано " + Dog.getCounter() + " собак.");
        System.out.println("Было создано " + Animal.getCounter() + " животных.");

    }
}
