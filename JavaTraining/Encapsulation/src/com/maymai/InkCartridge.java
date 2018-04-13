package com.maymai;

public class InkCartridge {
    private double blackLevel;
    private double colourLevel;

    public InkCartridge() {
        this.blackLevel = 100.0d;
        this.colourLevel = 100.0d;
    }

    public void changeBlackcartridge() {
        this.blackLevel = 100;
        System.out.println("Black cartridge now full.");
    }

    public void changeColourCartridge() {
        this.colourLevel = 100;
        System.out.println("Colour cartridge now full.");
    }

    public void useBlackInk(double percentageUse) {
        if(this.blackLevel >= percentageUse) {
            this.blackLevel -= percentageUse;
        } else {
            System.out.println("Not enough black ink on cartridge.");
        }
    }

    public void useColourInk(double percentageUse) {
        if(this.colourLevel >= percentageUse) {
            this.colourLevel -= percentageUse;
        } else {
            System.out.println("Not enough colour ink on cartridge.");
        }
    }

    public double getBlackLevel() {
        System.out.println("Black cartridge at " + String.format("%.2f", this.blackLevel) + "%.");
        return blackLevel;
    }

    public double getColourLevel() {
        System.out.println("Colour cartridge at " + String.format("%.2f", this.colourLevel) + "%.");
        return colourLevel;
    }
}
