package com.company.cars;

import com.company.components.Engine;
import com.company.components.GPSNavigator;
import com.company.components.TripComputer;

public class Car {

    private final CarType carType;
    private final Integer seatNumber;
    private final Engine engine;
    private final TripComputer tripComputer;
    private final GPSNavigator gps;
    private final double fuel=0;

    public Car(CarType carType, Integer seatNumber,
               Engine engine, TripComputer tripComputer,
               GPSNavigator gps) {
        this.carType = carType;
        this.seatNumber = seatNumber;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    public CarType getCarType() {
        return carType;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public TripComputer getTripComputerName() {
        return tripComputer;
    }

    public GPSNavigator getGps() {
        return gps;
    }

    public double getFuel() {
        return fuel;
    }
}
