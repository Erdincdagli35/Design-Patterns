package com.company;

public class Ship implements Transport{
    @Override
    public void getDeliver() {
        System.out.println("Deliver :: Ship");
    }
}
