package com.company.builders;

import com.company.cars.CarType;
import com.company.components.Engine;
import com.company.components.GPSNavigator;
import com.company.components.Transmission;
import com.company.components.TripComputer;

public interface Builder {
    void reset();
    void setCarType(CarType carType);
    void setSeats(Integer number);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gps);
}
