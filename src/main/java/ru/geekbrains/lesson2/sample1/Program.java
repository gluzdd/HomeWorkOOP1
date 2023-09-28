package ru.geekbrains.lesson2.sample1;

public class Program {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Персик");
        cat1.setColor("Рыжий");
        cat1.jump();

        Dog dog1 = new Dog();

        Animal o1 = dog1;
        Object o2 = dog1;

        Animal dog2 = new Dog();

        Cat cat2 = new Cat("Барсик");
        cat2.setColor("Серый");

        //Animal animal = new Animal("Четыре лапы и хвост");

        Animal[] animals = new Animal[4];
        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = dog1;
        animals[3] = dog2;

        processVoice(animals);
    }
    public static void processVoice(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof  Cat) {
                Cat cat = (Cat)animal;
                System.out.println(cat.getColor());
            }
           //System.out.println(cat.getColor());
            animal.voice();
        }
    }

}
