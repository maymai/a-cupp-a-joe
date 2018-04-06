package com.maymai;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setColour(String colour) {
        String validColour = colour.toLowerCase();
        if (validColour.equals("red") || validColour.equals("white") || validColour.equals("black")
                || validColour.equals("yellow") || validColour.equals("blue")) {
            this.colour = colour;
        }
    }
    public String getColour() {
        return this.colour;
    }
}
