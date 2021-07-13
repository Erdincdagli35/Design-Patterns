package com.company;

public class Main {

    public static void main(String[] args) {
        //Win created
        GUIFactory winFactory = new WinFactory();
        Application winApplication = new Application(winFactory);
        winApplication.createApp();

        System.out.println();

        //Mac created
        GUIFactory macFactory = new MacOSFactory();
        Application applicationMac = new Application(macFactory);
        applicationMac.createApp();

    }
}
