package com.company.components;

public class Engine {
    public final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage){
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        started = true;
    }

    public void off(){
        started = false;
    }

    public boolean isStarted(){
        return started;
    }

    public void go(double mileage){
        if (started){
            this.mileage+=mileage;
        }
        else {
            System.out.println("Cannot go firstly you gotta start engine..");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
