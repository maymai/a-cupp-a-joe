package com.maymai;

public class Car {
    private String name;
    private int wheels;
    private int doors;
    private String colour;
    private boolean engineStarted;
    private int velocity;

    public Car(String name, int wheels, int doors, String colour) {
        this.name = name;
        this.wheels = wheels;
        this.doors = doors;
        this.colour = colour;
        this.engineStarted = false;
        this.velocity = 0;
    }

    public String getName() {
        return name;
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

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public int getVelocity() {
        return velocity;
    }

    public void startEngine() {
        this.engineStarted = true;
    }

    public void accelerate() {
        if(this.engineStarted) {
            this.velocity++;
        }
    }

    public void breaking() {
        if(this.engineStarted && this.velocity > 0) {
            this.velocity--;
        }
    }

    public void stopEngine() {
        if(this.engineStarted) {
            while(this.velocity > 0) {
                breaking();
            }
            this.engineStarted = false;
        }
    }


}
