package ru.route;

import ru.transport.*;

public class Route {
    private String departurePoint;
    private String arrivingPoint;
    private String timeOfDeparture;
    private String timeOfArriving;
    private int distance;
    private Transport transport;

    public Route(String departurePoint, String arrivingPoint) {
        this.arrivingPoint = arrivingPoint;
        this.departurePoint = departurePoint;
    }

    public Route(String departurePoint, String arrivingPoint, String timeOfDeparture, String timeOfArriving, int distance, Transport transport) {
        this.arrivingPoint = arrivingPoint;
        this.departurePoint = departurePoint;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArriving = timeOfArriving;
        this.distance = distance;
        this.transport = transport;
    }

    public Route[] getAllRoutes() {
        Car car = new Car();
        Bus bus = new Bus();
        Plane plane = new Plane();
        Train train = new Train();
        Route[] routes = {
                new Route("Казань", "Москва", "06:30", "14:45", 815, bus),
                new Route("Казань", "Москва", "11:00", "19:11", 838, train),
                new Route("Казань", "Москва", "09:15", "10:45", 797, plane),
                new Route("Москва", "Калининград", "08:30", "19:45", 1225, train),
                new Route("Москва", "Калининград", "16:20", "18:05", 1089, plane),
                new Route("Москва", "Париж", "12:15", "15:05", 2834, plane),
                new Route("Москва", "Париж", "14:00", "20:30+2", 3210, bus),
                new Route("Москва", "Париж", "18:45", "06:20+1", 2980, train),
                new Route("Москва", "Париж", "08:00", "23:00+2", 3050, car),
                new Route("Париж", "Нью-Йорк", "10:00", "12:45", 5830, plane),
                new Route("Санкт-Петербург", "Калининград", "20:00", "09:30+1", 1050, bus),
                new Route("Санкт-Петербург", "Калининград", "07:15", "08:40", 739, plane),
                new Route("Санкт-Петербург", "Калининград", "22:30", "12:15+1", 1120, train),
                new Route("Нью-Йорк", "Лос-Анджелес", "08:00", "11:20", 3940, plane),
                new Route("Нью-Йорк", "Лос-Анджелес", "06:00", "22:00+2", 4460, car),
                new Route("Казань", "Сочи", "14:30", "12:05+1", 1650, train),
                new Route("Казань", "Сочи", "09:45", "12:05", 1463, plane),
                new Route("Казань", "Сочи", "07:00", "23:30", 1720, bus),
                new Route("Казань", "Сочи", "05:30", "20:45", 1580, car),
                new Route("Париж", "Берлин", "09:15", "12:45", 880, bus),
                new Route("Париж", "Берлин", "07:30", "10:45", 1050, train),
                new Route("Париж", "Берлин", "08:00", "14:30", 1045, car),
                new Route("Москва", "Стамбул", "16:40", "20:10", 1750, plane),
                new Route("Москва", "Стамбул", "12:00", "18:00+1", 2150, car),
                new Route("Калининград", "Варшава", "06:30", "12:15", 310, bus),
                new Route("Сочи", "Дубай", "22:10", "04:35+1", 2250, plane),
                new Route("Сочи", "Дубай", "08:00", "14:30+2", 2450, bus),
                new Route("Сочи", "Дубай", "10:15", "16:45+1", 2300, train),
                new Route("Берлин", "Прага", "07:50", "11:20", 350, car),
                new Route("Берлин", "Прага", "06:30", "10:45", 350, bus),
                new Route("Лос-Анджелес", "Токио", "13:25", "16:30+1", 8800, plane),
                new Route("Стамбул", "Анталья", "08:00", "09:35", 485, plane),
                new Route("Стамбул", "Анталья", "07:30", "15:45", 715, bus),
                new Route("Стамбул", "Анталья", "21:00", "08:30+1", 650, train),
                new Route("Стамбул", "Анталья", "06:00", "14:20", 690, car),
                new Route("Берлин", "Амстердам", "08:20", "12:45", 658, bus),
                new Route("Берлин", "Амстердам", "09:15", "13:30", 660, train),
                new Route("Рим", "Барселона", "10:30", "12:15", 861, plane),
                new Route("Рим", "Барселона", "20:00", "12:30+1", 1370, train),
                new Route("Рим", "Барселона", "07:45", "21:30", 1420, bus)
        };
        return routes;
    }

    public int calculatePrice() {
        return transport.getPrice() * distance;
    }
    public String toString() {
        return "Маршрут из " + departurePoint + " в " + arrivingPoint + " на транспорте: " + transport.getName() + "\nВремя отправления: " + timeOfDeparture + ". Время прибытия: " + timeOfArriving + "\nЦена билета: " + calculatePrice();
    }
}
