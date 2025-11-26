package ru.service;

import ru.route.*;

import java.util.Scanner;

public class InputRoute {
    public static void checkRoute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Откуда?");
        String userDeprt = scanner.nextLine();
        System.out.println("Куда?");
        String userArrv = scanner.nextLine();

        Route[] routes = Route.getAllRoutes();

        int flag = 0;
        for (Route route : routes) {
            if (route.getArrivingPoint().equals(userArrv) && route.getDeparturePoint().equals(userDeprt)) {
                flag = 1;
                System.out.println(route);
            }
        }
        if (flag == 0) System.out.println("Такого маршрута не существует");
    }
}
