package com.maymai;

public class Printer {
    private String model;
    private boolean duplex;
    private int maxPaper;
    private InkCartridge ink;
    private int currentPaper;
    private double colourInkUsePerPaper;
    private double blackInkUsePerPaper;

    public Printer(String model, boolean duplex, int maxPaper, InkCartridge ink, double colourInkUsePerPaper, double blackInkUsePerPaper) {
        this.model = model;
        this.duplex = duplex;
        this.maxPaper = maxPaper;
        this.ink = ink;
        this.currentPaper = maxPaper;
        this.colourInkUsePerPaper = colourInkUsePerPaper;
        this.blackInkUsePerPaper = blackInkUsePerPaper;
    }

    private void print(boolean colour, int pages, boolean duplex) {
        if((duplex && this.duplex && this.currentPaper >= (pages / 2) + (pages % 2)) ||
                ((!duplex || !this.duplex) && this.currentPaper >= pages)) {
            if (colour) {
                this.ink.useColourInk(colourInkUsePerPaper * (double) pages);
            } else {
                this.ink.useBlackInk(blackInkUsePerPaper * (double) pages);
            }
            if (duplex && this.duplex) {
                int paperUse = (pages / 2) + (pages % 2);
                this.currentPaper -= paperUse;
                System.out.println("Printing " + paperUse + " pages.");
            } else {
                if (!this.duplex) {
                    System.out.println("This printer cannot print duplex.");
                }
                this.currentPaper -= pages;
                System.out.println("Printing " + pages + " pages.");
            }
        } else {
            System.out.println("There isn't enough paper on printer to print " +
                    pages + " pages.");
        }
    }

    public void printColour(int pages, boolean duplex) {
        print(true, pages, duplex);
    }

    public void printColour(int pages) {
        print(true, pages, false);
    }

    public void printBlack(int pages, boolean duplex) {
        print(false, pages, duplex);
    }

    public void printBlack(int pages) {
        print(false, pages, false);
    }

    public void changeCartridge(boolean colour) {
        if(colour) {
            this.ink.changeColourCartridge();
        } else {
            this.ink.changeBlackcartridge();
        }
    }

    public void getCartridgeLevel(){
        ink.getBlackLevel();
        ink.getColourLevel();
    }

    public void refilPaper() {
        System.out.println("Refilling paper...");
        this.currentPaper = this.maxPaper;
        System.out.println("Paper available is now " + getCurrentPaper());
    }

    public int getCurrentPaper() {
        System.out.println(this.currentPaper + " pages in printer.");
        System.out.println("Max paper capacity: " + this.maxPaper + " pages.");
        return currentPaper;
    }

    public String getModel() {
        return model;
    }
}
