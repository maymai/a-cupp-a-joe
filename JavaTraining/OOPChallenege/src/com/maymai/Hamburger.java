package com.maymai;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String bread;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String bread) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = bread;
    }

    public void add(String name, double price) {
        if(additionSet(name, price)) {
            System.out.println("Added " + name + " for " + String.format("%.2f", price));
        } else {
            System.out.println("Cannot add " + name + " max items reached.");
        }
    }

    public boolean additionSet(String name, double price) {
        if (this.addition1Name == null) {
            addAddition1(name, price);
        } else if (this.addition2Name == null) {
            addAddition2(name, price);
        } else if (this.addition3Name == null) {
            addAddition3(name, price);
        } else if (this.addition4Name == null) {
            addAddition4(name, price);
        } else {
            return false;
        }
        return true;
    }

    private void addAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    private void addAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    private void addAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    private void addAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double calculateTotal() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.bread +
            " bread with " + this.meat + " meat is " + String.format("%.2f", hamburgerPrice));
        if(addition1Name != null) {
            System.out.println("Plus " + this.addition1Name + " " + String.format("%.2f", addition1Price));
            hamburgerPrice += addition1Price;
        }
        if(addition2Name != null) {
            System.out.println("Plus " + this.addition2Name + " " + String.format("%.2f", addition2Price));
            hamburgerPrice += addition2Price;
        }
        if(addition3Name != null) {
            System.out.println("Plus " + this.addition3Name + " " + String.format("%.2f", addition3Price));
            hamburgerPrice += addition3Price;
        }
        if(addition4Name != null) {
            System.out.println("Plus " + this.addition4Name + " " + String.format("%.2f", addition4Price));
            hamburgerPrice += addition4Price;
        }
        return hamburgerPrice;
    }
}
