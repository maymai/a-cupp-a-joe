package com.maymai;

public class Switch {
    private boolean on;

    public Switch(boolean on) {
        this.on = on;
    }

    public void switchOn() {
        if(!this.on) {
            System.out.println("Switch turns on");
            this.on = true;
        } else {
            System.out.println("Switch is on");
        }
    }

    public void switchOff() {
        if(this.on) {
            System.out.println("Switch turns off");
            this.on = false;
        } else {
            System.out.println("Switch is off");
        }
    }
}
