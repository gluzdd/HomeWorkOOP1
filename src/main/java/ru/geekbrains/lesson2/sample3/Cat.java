package ru.geekbrains.lesson2.sample3;

public class Cat extends BaseCat implements Runner{

    private String name;

    private int maxRun;

    private int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }



    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.printf("%s перепрыгнул через стену %d см. \n", name, height);
            return true;
        }
        else {
            System.out.printf("%s не смог перепрыгнуть через стену %d см. \n", name, height);
            return false;
        }

    }

    @Override
    public boolean run(int length) {
        if (length <= maxRun) {
            System.out.printf("%s перепрыгнул через стену %d см. \n", name, length);
            return true;
        }
        else {
            System.out.printf("%s не смог перепрыгнуть через стену %d см. \n", name, length);
            return false;
        }
    }
}
