package ru.transport;

public class Transport {
    protected String name;
    protected int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Transport(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
