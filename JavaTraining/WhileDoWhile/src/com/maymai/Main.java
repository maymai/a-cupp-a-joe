package com.maymai;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        System.out.println("-----------------------------");
        while(count != 6) {
            System.out.println("Count is " + count);
            count++;
        }
        System.out.println("-----------------------------");
        for(count=1; count != 6; count++) {
            System.out.println("Count is " + count);
        }
        count = 1;
        System.out.println("-----------------------------");
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count is " + count);
            count++;
        }
        count = 1;
        System.out.println("-----------------------------");
        do {
            System.out.println("Count is " + count);
            count++;
        } while(count != 6);
        // do while executes at least once, so if the while begins as false, it will run forever
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(234));
        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(65));

        int number = 4;
        int endNumber = 20;
        int totalEven = 0;
        while(number <= endNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println(number + " is an even number");
            totalEven++;
            if (totalEven >= 5) {
                break;
            }
        }
        System.out.println("Found " + totalEven + " even numbers");


    }
    private static boolean isEvenNumber(int n) {
        return(n%2 == 0);
    }
}
