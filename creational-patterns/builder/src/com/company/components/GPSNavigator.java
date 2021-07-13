package com.company.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        System.out.println("84.Street, Atatürk. No:7/3 Fasıl Aprt. Foça/İzmir");
    }

    public GPSNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
