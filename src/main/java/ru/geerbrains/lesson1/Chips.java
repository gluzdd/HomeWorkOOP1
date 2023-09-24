package ru.geerbrains.lesson1;

public class Chips extends Product {

    private String taste;

    private String form;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Chips(String brand, String name, double price, String taste, String form) {
        super(brand, name, price);
        this.taste = taste;
        this.form = form;
    }

    @Override
    public String displayInfo() {
        return String.format("[Chips] %s - %s - %.2f - [Вкус] %s - [Форма] %s;", brand, name, price, taste, form);
    }
}
