package com.maymai;

public class Main {

    public static void main(String[] args) {

        // unicode character
        char myChar = 'D';
        char anotherChar = '&';
        char oneMoreChar = '\u00A9';
        System.out.println("My Unicode Char = " + oneMoreChar);

        boolean myBoolean = true;
        boolean anotherBoolean = false;

        // exercise
        char regChar = '\u00AE';
        System.out.println(regChar);
    }
}
