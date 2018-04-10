package com.maymai;

public class Main {

    public static void main(String[] args) {

        // int has no decimal values (width of 32/4 bytes)
        int myIntValue = 5 / 3;
        // float has 7 digits of precision (width of 32/4 bytes)
        float myFloatValue = 5f / 3f;
        // doubles have 16 digits of precision (width of 64/8 bytes)
        double myDoubleValue = 5d / 3d;
        // if a float is entered without the 'f', java turns it into a double

        System.out.println("Int = " + myIntValue);
        System.out.println("Float = " + myFloatValue);
        System.out.println("Double = " + myDoubleValue);

        // exercise
        int myPounds = 200;
        double myKilos = (myPounds * 0.453_592_37);
        System.out.println(myPounds + " pounds = " + myKilos + " kilograms.");
    }
}
