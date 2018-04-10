package com.maymai;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private String colour;
    private int maxGear;
    private int currentGear;
    private double maxSpeedAtGear;

    public Car(String name, int maxPassengers, int maxSpeed,
               int wheels, int doors, String colour, int maxGear) {
        super(name, maxPassengers, maxSpeed);
        this.wheels = wheels;
        this.doors = doors;
        this.colour = colour;
        this.maxGear = maxGear;
        this.currentGear = 0;
        this.maxSpeedAtGear = 0;
    }

    public Car(String name) {
        this(name, 5, 100, 4, 3, "red", 5);
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setGear(int newGear) {
        if(newGear <= maxGear) {
            this.currentGear = newGear;
        } else {
            System.out.println(getName() + " only goes to gear " + maxGear);
        }
        System.out.println(getName() + " at gear " + getCurrentGear() + ". Max speed: " + getMaxSpeedAtGear());
    }

    private void setMaxSpeedAtGear() {
        if(getCurrentGear() > 0) {
            this.maxSpeedAtGear = getMaxSpeed() / (getMaxGear() - getCurrentGear());
        } else {
            System.out.println("Car in neutral gear, change gear first");
        }
    }

    public int getMaxGear() {
        return maxGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public double getMaxSpeedAtGear() {
        setMaxSpeedAtGear();
        return maxSpeedAtGear;
    }
}
