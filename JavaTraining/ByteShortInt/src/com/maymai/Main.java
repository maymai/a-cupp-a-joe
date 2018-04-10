package com.maymai;

public class Main {

    public static void main(String[] args) {

    // int has a width of 32

    // literal = fixed value
    int minValue = -2147483648;

    // you can add underscores to make a literal more readable
	int maxValue = 2_147_483_647;

	// statement = expression
    int a = 2;
    int b = 5;
    int myExpression = (a * b);

    // byte has a width of 8
    byte byteMinValue = -128;
    byte byteMaxValue = 127;

    // java automatically converts expressions into int
    // to get a different data type use casting
    byte byteTotal = (byte) (byteMaxValue/2);

    // short has a width of 16
    short shortMinValue = -32768;
    short shortMaxValue = 32767;

    // long has a width of 64
    // use L at the end to mark a long number
    long longValue = 100L;
    long longMinValue = -9_223_372_036_854_775_808L;
    long longMaxValue = 9_223_372_036_854_775_807L;

    // exercise
    byte myByte = 123;
    short myShort = 23456;
    int myInt = 1_234_567_890;
    long longTotal = 50_000L + (10L * (myByte + myShort + myInt));
    System.out.println(longTotal);
    }
}
