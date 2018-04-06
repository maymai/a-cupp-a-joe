package com.maymai;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println("Car colour is " + porsche.getColour());
        // porsche.colour = "red"; - to change public variables
        // it is best practice to keep variables private and create methods to change them
        porsche.setColour("red");
        System.out.println("Car colour is " + porsche.getColour());
        holden.setColour("burgundy");
        System.out.println("Car colour is " + holden.getColour());
        holden.setColour("blue");
        System.out.println("Car colour is " + holden.getColour());
    }
}
