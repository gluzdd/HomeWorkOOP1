package ru.geekbrains.lesson2.sample1;

public class Cat extends Animal {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Котик мяукает");
    }

    @Override
    public void jump() {
        System.out.println("Котик прыгает");
    }
}
