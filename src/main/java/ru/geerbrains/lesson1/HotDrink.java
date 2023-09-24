package ru.geerbrains.lesson1;

public class HotDrink extends Product {

    private int temperature;

    private  int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(String brand, String name, double price, int temperature, int volume) {
        super(brand, name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Напиток] %s - %s - [Цена] %.2f - [Температура] %d - [Объём] %d;", brand, name, price, temperature, volume);
    }
}
