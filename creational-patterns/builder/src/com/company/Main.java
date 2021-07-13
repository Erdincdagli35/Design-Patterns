package com.company;

import com.company.builders.CarBuilder;
import com.company.builders.CarManualBuilder;
import com.company.cars.Car;
import com.company.cars.Manual;
import com.company.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        System.out.println("----------------------------------");

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
