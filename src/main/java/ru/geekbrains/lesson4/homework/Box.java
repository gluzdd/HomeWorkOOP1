package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fructs;

    public Box() {
        this.fructs = new ArrayList<T>();

    }

    public void addFruit(T fruit) {
        fructs.add(fruit);
    }

    public float getBoxWeight() {
        float massa = 0;
        for (T fruit : fructs) {
            massa += fruit.getWeight();
        }
        return massa;
    }

    public boolean compare(Box box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }

    public void Transfer(Box<T> box) {
        box.fructs.addAll(this.fructs);
        this.fructs.clear();
    }


    @Override
    public String toString() {
        return "Box{" +
                "fructs=" + fructs +
                '}';
    }
}











