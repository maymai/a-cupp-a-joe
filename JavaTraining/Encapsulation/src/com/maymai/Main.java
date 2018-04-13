package com.maymai;

public class Main {

    public static void main(String[] args) {
	// Encapsulation delimits what can be accessed from classes
    // By making fields and methods private and creating specific public methods
    // to access those private elements preventing external access
        Printer myPrinter = new Printer("Diskjet", true, 500,
                new InkCartridge(), 0.2, 0.1);
        myPrinter.printColour(20);
        myPrinter.printColour(30, true);
        myPrinter.printBlack(45);
        myPrinter.printBlack(38, true);
        myPrinter.printColour(40);
        myPrinter.printColour(12);
        myPrinter.printColour(36);
        myPrinter.printBlack(33);
        myPrinter.printBlack(13);
        myPrinter.printBlack(7);
        myPrinter.getCartridgeLevel();
        myPrinter.getCurrentPaper();
        myPrinter.printColour(36);
        myPrinter.printBlack(33);
        myPrinter.getCartridgeLevel();
        myPrinter.getCurrentPaper();
        System.out.println("Printer model: " + myPrinter.getModel());
        myPrinter.refilPaper();
        myPrinter.printBlack(500);
        myPrinter.getCartridgeLevel();
        myPrinter.getCurrentPaper();
        myPrinter.changeCartridge(true);
        myPrinter.changeCartridge(false);
        myPrinter.getCartridgeLevel();

        Printer oldPrinter = new Printer("Lalala", false, 200,
                new InkCartridge(), 0.5, 0.5);
        oldPrinter.printColour(20, true);
    }
}
