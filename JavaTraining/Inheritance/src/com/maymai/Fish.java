package com.maymai;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name) {
        super(name, 1, 1, 2, 2);
        this.gills = 1;
        this.eyes = 2;
        this.fins = 1;
    }

    public void rest() {
        System.out.println(getName() + " stops moving");
    }

    public void swim(int speed) {
        moveBackFin();
        super.move(speed);
    }

    private void moveBackFin() {
        System.out.println(getName() + " moves its back fin");
    }

    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
