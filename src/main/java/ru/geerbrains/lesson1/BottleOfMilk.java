package ru.geerbrains.lesson1;

public class BottleOfMilk extends Product {

    private double volume; // объём

    private int fat; // жирность

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fat) {
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[МОЛОКО] %s - %s - %.2f - объём %.2f; жирность: %d", brand, name, price, volume, fat);
    }
}
