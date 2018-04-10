package com.maymai;

public class Vehicle {
    private String name;
    private int maxPassengers;
    private double maxSpeed;

    public Vehicle(String name, int maxPassengers, double maxSpeed) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void move(int speed) {
        System.out.println(getName() + " moved " + speed);
    }
}

