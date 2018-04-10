package com.maymai;

public class Main {

    public static void main(String[] args) {
	/* 8 primitive data types in java:
	byte
	short
	int
	long
	float
	double
	char
	boolean
	Strings are methods!!!
	 */
	String myString = "This is a string.";
	System.out.println(myString);

	myString += " A very long string.";
	System.out.println(myString);

	int myNumber = 123;
	System.out.println(myString + myNumber);
	// Java knows when to convert integers to strings!

    double myDecimalNumber = 12.34;
    System.out.println(myString + myDecimalNumber);
    }
}
