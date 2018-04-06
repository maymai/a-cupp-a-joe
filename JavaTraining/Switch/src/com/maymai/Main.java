package com.maymai;

public class Main {

    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }

        int switchvalue = 1;
        switch (switchvalue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Actually it was " + switchvalue);
                break;
            default:
                System.out.println("Value is not 1 or 2");
                break;
        }
        System.out.println(nameTheLetter());
    }

    private static String nameTheLetter() {
            char letter = 'B';
            switch(letter) {
                case 'A':
                    return("The letter is A");
                case 'B':
                    return("The letter is B");
                case 'C':
                    return("The letter is C");
                case 'D': case 'E':
                    return("The letter is " + letter);
                default:
                    return("Lalalala");
            }
        }

    }
