package com.company.Person;


import com.company.Transport.*;

public class Person {
    int p_Age;
    String p_Sex;
    String id;
    String p_Name;

    public Person() {
    }

    public Person(String string) {
    }

    public void driveTransport(Airship airship) {
        airship.DrivingMethod();
    }

    public void driveTransport(Aircraft aircraft) {
        aircraft.DrivingMethod();
    }

    public void driveTransport(Automobile automobile) {
        automobile.DrivingMethod();
    }

    public void driveTransport(Bicycle bicycle) {
        bicycle.DrivingMethod();
    }

    public void driveTransport(HotAirballon hotAirBallon) {
        hotAirBallon.DrivingMethod();
    }

    public void driveTransport(Hovercraft hovercraft) {
        hovercraft.DrivingMethod();
    }

    public void driveTransport(Motorcycle motocycle) {
        motocycle.DrivingMethod();
    }

    public void driveTransport(Submarine submarine) {
        submarine.DrivingMethod();
    }

    public void driveTransport(Ship ship) {
        ship.DrivingMethod();
    }

    public void driveTransport(Train train) {
        train.DrivingMethod();
    }



}
