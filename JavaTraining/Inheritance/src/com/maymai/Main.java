package com.maymai;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal("Animal", 1,
            1, 5, 5);
	Dog dog = new Dog("Yorkie", 8,
            20, 2, 4,1, 20, "Long and silky");
    dog.eat("dog food");
    dog.walk();
    dog.run();

    Fish guppy = new Fish("Guppy");
    Fish enderGuppy = guppy;
    guppy.swim(5);
    System.out.println("Ender guppy name: " + enderGuppy.getName());
    enderGuppy.setName("Ender Guppy");
    System.out.println("Ender guppy name: " + enderGuppy.getName());
    System.out.println("Guppy name: " + guppy.getName());
    Fish bettaFish = new Fish("Betta Fighting Fish");
    enderGuppy = bettaFish;
    System.out.println("Ender guppy name: " + enderGuppy.getName());
    System.out.println("Betta name: " + bettaFish.getName());

    guppy.swim(20);
    bettaFish.swim(10);

    Dog puppy = new Dog("Cocker Spaniel");
    puppy.run();
    }
}
