package com.maymai;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean moreNumbers = true;
        System.out.println("How many numbers do you want to sort?\r");
        int numberOfNumbers = scanner.nextInt();
        printIntsDesc(numberOfNumbers);
    }

    private static int[] getInts(int number) {
        System.out.println("Please enter " + number + " numbers.\r");
        int[] values = new int[number];
        for(int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static int[] SortDesc(int[] originalArray) {
        int[] sortedArray = Arrays.copyOf(originalArray, originalArray.length);
        boolean continueSort = true;
        int currentNum;
        while(continueSort) {
            continueSort = false;
            for(int i=0;i<sortedArray.length-1;i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    currentNum = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = currentNum;
                    continueSort = true;
                }
            }
        }
        return sortedArray;
    }

    private static void printIntsDesc(int number) {
        int[] originalArray = getInts(number);
        int[] newArray = SortDesc(originalArray);
        System.out.println("Numbers in descending order:");
        for(int i=0;i<newArray.length;i++) {
            System.out.println("Number " + i + ": " + newArray[i]);
        }
    }
}
