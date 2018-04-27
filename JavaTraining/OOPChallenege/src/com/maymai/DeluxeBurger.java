package com.maymai;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String meat, String bread) {
        super("Deluxe", meat, 5.99, bread);
        add("chips", 0.00);
        add("drink", 0.00);
    }
}
