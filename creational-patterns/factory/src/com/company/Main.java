package com.company;

public class Main {

    public static void main(String[] args) {
        Logistics logisticsSea;
        Logistics logisticsRoad;

        logisticsSea = new SeaLogistics();
        logisticsRoad = new RoadLogistics();

        logisticsSea.planDelivery();
        System.out.println("---------------------------");
        logisticsRoad.planDelivery();

    }
}
