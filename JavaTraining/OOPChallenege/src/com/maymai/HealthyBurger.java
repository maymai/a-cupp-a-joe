package com.maymai;

public class HealthyBurger extends Hamburger {
    private String healthyAddition1Name;
    private double healthyAddition1Price;
    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "brown rye");
    }

    private void addHealthyAddition1(String name, double price) {
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }

    private void addHealthyAddition2(String name, double price) {
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;
    }

    @Override
    public boolean additionSet(String name, double price) {
        boolean addition = super.additionSet(name, price);
        if (!addition && healthyAddition1Name == null){
            addHealthyAddition1(name, price);
        } else if (!addition && healthyAddition2Name == null) {
            addHealthyAddition2(name, price);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public void add(String name, double price) {
        super.add(name, price);
        // DOES NOT WORK!!!! SAYS ITS FULL???
    }

    @Override
    public double calculateTotal() {
        double hamburgerPrice = super.calculateTotal();
        if (healthyAddition1Name != null) {
            System.out.println("Plus " + this.healthyAddition1Name + " " +
                    String.format("%.2f", healthyAddition1Price));
            hamburgerPrice += healthyAddition1Price;
        }
        if (healthyAddition2Name != null) {
            System.out.println("Plus " + this.healthyAddition2Name + " " +
                    String.format("%.2f", healthyAddition2Price));
            hamburgerPrice += healthyAddition2Price;
        }
        return hamburgerPrice;
    }
}
