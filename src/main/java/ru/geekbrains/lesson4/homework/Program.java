package ru.geekbrains.lesson4.homework;

import ru.geekbrains.lesson4.Employee;
import ru.geekbrains.lesson4.MyArrayList;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {


       // MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[10]);
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();
        Box<Orange> box4 = new Box<>();

        // Яблоки
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());

        box3.addFruit(new Apple());
        box3.addFruit(new Apple());
        box3.addFruit(new Apple());
        box3.addFruit(new Apple());
        box3.addFruit(new Apple());
        box3.addFruit(new Apple());

        // Апельсины
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());


        box4.addFruit(new Orange());
        box4.addFruit(new Orange());
        box4.addFruit(new Orange());
        box4.addFruit(new Orange());

        // Вес  ящиков
        System.out.println(box1.getBoxWeight());
        System.out.println(box2.getBoxWeight());

        // Сравниваем  вес ящиков
        System.out.println(box1.compare(box2));

        // Перенос фруктов
        box1.Transfer(box3);;
        System.out.println(box3);

        box2.Transfer(box4);;
        System.out.println(box4);




//        System.out.println(Apple);
//        System.out.println(Orange);

        //System.out.println(Apple.getWeight());
        //System.out.println(Orange.getWeight());
    }
}
