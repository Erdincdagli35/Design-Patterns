package com.company;

public abstract class Logistics {
    public void planDelivery(){
        Transport transport = createTransport();
        transport.getDeliver();
    }
    public abstract Transport createTransport();
}
