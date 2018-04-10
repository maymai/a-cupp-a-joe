package com.maymai;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes,
               int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        // super refers to the constructor on the parent class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public Dog(String name) {
        this(name, 5, 10, 2, 4, 1, 40, "pretty");
    }
    // any public method on the parent class is available to the child class
    private void chew() {
        System.out.println(getName() + ": 'nomnomnom'");
    }

    @Override //reminder that the following method is overriding the parent method
    public void eat(String food) {
        super.eat(food);
        chew();
    }

    public void walk() {
        move(5);
        // if super.move() was used it would not be overwritten by the new dog.move method
    }

    public void run(){
        move(10);
    }
    private void moveLegs(int speed) {
        String legSpeed;
        if(speed > 5) {
            legSpeed = "very fast";
        } else {
            legSpeed = "one after the other";
        }
        System.out.println("Leg moves " + legSpeed);
    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        System.out.println(getName() + ": 'Bounce bounce bounce'");
        super.move(speed);
    }

}
