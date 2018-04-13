package com.maymai;

public class Room {
    private String name;
    private int width;
    private int depth;
    private int height;
    private Bed bed;
    private Door exit;
    private Door bathroomDoor;
    private Switch lightSwitch;

    public Room(String name, int width, int depth, int height, Bed bed, Door exit, Door bathroomDoor, Switch lightSwitch) {
        this.name = name;
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.bed = bed;
        this.exit = exit;
        this.bathroomDoor = bathroomDoor;
        this.lightSwitch = lightSwitch;
    }

    public int getWidth() {
        System.out.println("The room is " + this.width + " feet wide.");
        return width;
    }

    public int getDepth() {
        System.out.println("The room is " + this.depth + " feet long.");
        return depth;
    }

    public int getHeight() {
        System.out.println("The room is " + this.height + " feet high.");
        return height;
    }

    public void turnLightsOn() {
        this.lightSwitch.switchOn();
    }

    public void turnLightsOff() {
        this.lightSwitch.switchOff();
    }

    public Door getBathroomDoor() {
        return this.bathroomDoor;
    }

    public Bed getBed() {
        return bed;
    }

    public Door getExit() {
        return exit;
    }

}
