package com.maymai;

public class Main {

    public static void main(String[] args) {
	// Compositions are parts of a whole:
    // A computer has a keyboard and a motherboard
    // But a keyboard and motherboard are not computers
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case thecase = new Case("case model", "case manufacturer",
                "power supply", dimensions);
        Monitor monitor = new Monitor("monitor model", "monitor manufacturer",
                24, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("motherboard model",
                "motherboard manufacturer", 4, 6, "motherboard bios");
        Computer theComputer = new Computer(thecase, monitor, motherboard);

//        theComputer.getMonitor().drawPIxelAt(1500, 1200, "red");
//        theComputer.getMotherboard().loadProgram("My program");
//        theComputer.getTheCase().pressPowerButton();
        theComputer.powerUp();
        // best practice - look into compositions before inheritance
    }
}
