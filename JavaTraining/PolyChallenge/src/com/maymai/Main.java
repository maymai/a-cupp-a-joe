package com.maymai;

class Audi extends Car {
    public Audi(String name, int wheels, int doors, String colour) {
        super(name, wheels, doors, colour);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        super.accelerate();
        super.accelerate();
        super.accelerate();
        super.accelerate();
        System.out.println("Current car speed: " + getVelocity());
    }

    @Override
    public void breaking() {
        super.breaking();
        super.breaking();
        super.breaking();
        super.breaking();
        super.breaking();
        System.out.println("Current car speed: " + getVelocity());
    }
}

class Fusca extends Car {
    public Fusca(String name, int wheels, int doors, String colour) {
        super(name, wheels, doors, colour);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        // You can use getClass().getSimpleName() to get the name of the class
        System.out.println(getClass().getSimpleName() + " current speed: " + getVelocity());
    }

    @Override
    public void breaking() {
        super.breaking();
        System.out.println(getClass().getSimpleName() + " current speed: " + getVelocity());
    }
}

class VW extends Car {
    public VW(String name, int wheels, int doors, String colour) {
        super(name, wheels, doors, colour);
    }
}

public class Main {

    public static void main(String[] args) {
        Car fusca = new Fusca("Fusca", 4, 3, "White");
        Car tt = new Audi("TT", 4, 5, "Black");
        Car polo = new VW("Polo", 4, 3, "Red");

        fusca.accelerate();
        fusca.breaking();
        fusca.stopEngine();
        System.out.println(fusca.getName() + " engine is on: " + fusca.isEngineStarted());
        fusca.startEngine();
        fusca.accelerate();
        fusca.accelerate();
        System.out.println(fusca.getName() + " engine is on: " + fusca.isEngineStarted());
        fusca.accelerate();
        fusca.stopEngine();
        System.out.println(fusca.getName() + " engine is on: " + fusca.isEngineStarted());
        tt.startEngine();
        tt.accelerate();
        System.out.println(tt.getName() + " engine is on: " + tt.isEngineStarted());
        tt.accelerate();
        System.out.println(tt.getName() + " engine is on: " + tt.isEngineStarted());
        tt.stopEngine();
        System.out.println(tt.getName() + " engine is on: " + tt.isEngineStarted());
    }
}
