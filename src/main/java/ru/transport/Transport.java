package ru.transport;

public class Transport {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Transport(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
