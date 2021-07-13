package com.company;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("Test");
        Singleton anotherSingleton = Singleton.getInstance("Run");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
