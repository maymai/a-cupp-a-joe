package com.maymai;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000d, 2d));

        /* for(init; termination; increment)
            * init = variable at the start of the loop
            * termination = statement that terminates the loop when false
            * increment = what happens at the end of each iteration
        */
        for(int i=2; i<=8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000d, (double) i)));
        }
        System.out.println("--------------------------------");
        for(int i=8; i>=2; i--) {
            System.out.println("20,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(20000d, (double) i)));
        }
        printPrimes(24);
        printPrimes(45);
        printPrimes(10541);
    }
    private static void printPrimes(int maxNumber) {
        int maxPrimes = 5;
        System.out.println("Calculating " + maxPrimes + " primes lower than " + maxNumber);
        int primes = 0;
        for(int i=maxNumber; i>= 1; i--) {
            if(isPrime(i)) {
                System.out.println(i + " is prime");
                primes++;
                if(primes >= maxPrimes) {
                    break;
                }
            }
        }
    }
    private static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }
    private static boolean isPrime(int n) {
        if(n>1){
            //for(int i=2; i <= n/2; i++) - using the square root of n is more efficient (the loop runs less times)
            for(int i=2; i <= (long) Math.sqrt(n); i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
