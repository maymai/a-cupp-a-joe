package com.maymai;

public class Main {

    public static void main(String[] args) {
	Hamburger burger = new Hamburger("Burger", "beef", 2.99, "white");
    System.out.println("Total price is " + String.format("%.2f", burger.calculateTotal()));
    burger.add("letuce", 0.86);
    System.out.println("Total price is " + String.format("%.2f", burger.calculateTotal()));
    burger.add("tomato", 0.54);
    burger.add("cheese", 1.2);
    System.out.println("Total price is " + String.format("%.2f", burger.calculateTotal()));

    HealthyBurger healthy = new HealthyBurger("chicken", 3.76);
    healthy.add("ketchup", 0.50);
    healthy.add("mayonnaise", 0.75);
    healthy.add("bacon", 1.75);
    healthy.add("cheese", 0.65);
    healthy.add("onion rings", 1.25);
    healthy.add("tomato", 0.43);
    healthy.add("letuce", 0.24);
    System.out.println("Total price is " + String.format("%.2f", healthy.calculateTotal()));

    DeluxeBurger deluxeBurger = new DeluxeBurger("angus beef", "brioche");
    deluxeBurger.add("bacon", 1.54);
    deluxeBurger.add("egg", 0.89);
    deluxeBurger.add("cheese", 0.75);
    System.out.println("Total price is " + String.format("%.2f", deluxeBurger.calculateTotal()));

    }
}
