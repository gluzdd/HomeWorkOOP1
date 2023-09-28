package ru.geekbrains.lesson2.HomeWork2;

public class Plate {

    private int food;

    private int meal;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void AddFood(int food, int meal) {
        food += meal;
        System.out.println("Добавил еду " + meal);
        System.out.println("Кол-во еды в тарелке " + food);
    }
}
