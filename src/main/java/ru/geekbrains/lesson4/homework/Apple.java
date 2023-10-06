package ru.geekbrains.lesson4.homework;

public class Apple extends Fruit {

    private String name = "apple";
    public Apple() {
        super(1f);
        this.name = "apple";
    }

    @Override
    public String toString() {
        return name;
    }
}

