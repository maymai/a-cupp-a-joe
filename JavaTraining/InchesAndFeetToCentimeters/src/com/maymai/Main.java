package com.maymai;

public class Main {

    public static void main(String[] args) {
        int feet = 8;
        int inches = 4;

        displayCentimeters(feet, inches);
        displayCentimeters(inches);
        displayCentimeters(5, 7);
        displayCentimeters(3, 13);
        displayCentimeters(-1, 2);
        displayCentimeters(-1);
    }

    private static void displayCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches >= 12) {
            System.out.println("Invalid " + feet + " feet or " + inches + " inches.");
        } else {
            double totalInches = inches + feet * 12;
            displayCentimeters(totalInches);
        }
    }

    private static void displayCentimeters(double inches) {
        double centimeters = toCentimeters(inches);
        if (centimeters < 0)
            System.out.println("Invalid " + inches + " inches");
        else
            System.out.println(inches + " inches = " + centimeters + " centimeters.");
    }

    private static double toCentimeters(double inches) {
        if (inches < 0)
            return -1;
        else
            return inches * 2.54;
    }
}
