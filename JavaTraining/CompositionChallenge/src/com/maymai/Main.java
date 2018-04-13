package com.maymai;

public class Main {

    public static void main(String[] args) {
        Room bedroom = new Room("bedroom",3, 4, 4, new Bed("king"),
                new Door(false, true, false), new Door(false, false,false),
                new Switch(false));
        bedroom.turnLightsOff();
        bedroom.turnLightsOn();
        bedroom.getBathroomDoor().open();
        bedroom.getBathroomDoor().lock();
        bedroom.getExit().open();
        bedroom.getExit().close();
        bedroom.getExit().unlock();
        bedroom.getExit().lock();
        bedroom.getBed().sitDown();
        bedroom.getBed().lieDown();
        bedroom.getBed().jump();
        bedroom.getBed().jump();
        bedroom.getBed().jump();
        bedroom.getBed().jump();
        bedroom.getBed().jump();
        bedroom.getBed().sitDown();
        bedroom.getBed().lieDown();
        bedroom.getBed().jump();
    }
    // by adding walls with directions to the room you main gain directions
    // and locations for doors and windows
    // in this case the Wall would have the door object
    // and the room would have one wall for each direction
}
