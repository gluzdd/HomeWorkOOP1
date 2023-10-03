package ru.geekbrains.lesson3;

public class Worker extends Employee {


    public Worker(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фисированная): %.2f руб. Возраст: %d",
                surName, name, salary, age);
    }
}
