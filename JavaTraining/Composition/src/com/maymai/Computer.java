package com.maymai;

public class Computer {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
// You don't need getters - instead you can create methods using the fields directly
//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//    public void powerUp() {
//        getTheCase().pressPowerButton();
//        drawLogo();
//    }
//

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPIxelAt(1200, 50, "yellow");
    }
    //calling methods this way makes the code more lean and less complex
}
