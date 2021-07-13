package com.company.builders;

import com.company.cars.CarType;
import com.company.cars.Manual;
import com.company.components.Engine;
import com.company.components.GPSNavigator;
import com.company.components.Transmission;
import com.company.components.TripComputer;

public class CarManualBuilder implements Builder {

    private CarType carType;
    private Integer seatNumber;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gps;

    @Override
    public void reset() {
        System.out.println("Resetting...");
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(Integer number) {
        this.seatNumber = number;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gps) {
        this.gps = gps;
    }

    public Manual getResult() {
        return new Manual(carType, seatNumber, engine,transmission, tripComputer, gps);
    }
}
