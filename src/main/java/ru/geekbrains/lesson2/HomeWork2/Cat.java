package ru.geekbrains.lesson2.HomeWork2;

public class Cat {

    private String name;
    private int appetite;
    protected int satiety;

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(int appetite, int food) {
        if (appetite > 0 && food > 0) {
            if (appetite > food) {
                System.out.println("Кот обнаглел");
            }
            else {
                food = food - appetite;
                System.out.println(food + " - осталось в тарелке корма ");
            }
        }
        else {
            System.out.println("Вы ввели отрицательное значение");
        }

    }
    public boolean hungry(int satiety, int food) {
        int res = food - satiety;
        return res >= 0;
    }

}
