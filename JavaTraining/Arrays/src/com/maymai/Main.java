package com.maymai;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0;i<myIntegers.length;i++) {
            System.out.println(myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
        int[] myIntArray;
        myIntArray = new int[10];
        myIntArray[5] = 50;
        // Adds 50 to position 5, starting at 0
        double[] myDoubleArray = new double[15];
        System.out.println(myIntArray[5]);
        String[] myStringArray = {"La", "Lala", "Lalala", "lalalala"};
        System.out.println(myStringArray[2]);
        System.out.println(myDoubleArray[3]);
        for(int i=0; i<myDoubleArray.length; i++) {
            myDoubleArray[i] = i*10;
        }
        System.out.println(myDoubleArray[3]);
        for(int i=0; i<myDoubleArray.length; i++) {
            System.out.println(myDoubleArray[i]);
        }
        // you can only access as many items as the list has, attempting to access a greater index causes an error
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
