package com.maymai;
/* Basic animal class that contains fields and methods common to ALL animals
 * This class will be inherited by other animal classes
 */

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }

    public void move(int speed) {
        System.out.println(getName() + " is moving " + speed);
    }

    public void setName(String name) {
        this.name = name;
    }
}