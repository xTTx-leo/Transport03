package com.company.Transport;

import java.util.Date;

public class Submarine{
    public Submarine() {
    }

    public void DrivingMethod(){

    }

    String ownership;
    String GPSPosition;
    String price;
    Date dataOfPurchase;
    String ID;

    public String getOwnership() {
        return ownership;
    }

    public Submarine(String ownership, String GPSPosition, String price, Date dataOfPurchase, String ID) {
        this.ownership = ownership;
        this.GPSPosition = GPSPosition;
        this.price = price;
        this.dataOfPurchase = dataOfPurchase;
        this.ID = ID;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDataOfPurchase() {
        return dataOfPurchase;
    }

    public void setDataOfPurchase(Date dataOfPurchase) {
        this.dataOfPurchase = dataOfPurchase;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
