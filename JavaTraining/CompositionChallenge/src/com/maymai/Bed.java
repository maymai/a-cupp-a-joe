package com.maymai;

public class Bed {
    private String size;
    private int jumps;
    private boolean broken;

    public Bed(String size) {
        this.size = size;
        this.jumps = 0;
        this.broken = false;
    }

    public void lieDown() {
        if(this.broken) {
            System.out.println("You lie on the bed. You can feel a spring on your back.");
        } else {
            System.out.println("You lie on the bed. It's soft and bouncy.");
        }
    }

    public void sitDown() {
        if(this.broken) {
            System.out.println("You sit on the bed. You can feel a spring poke you on the bottom.");
        } else {
            System.out.println("You lie on the bed. It's soft and bouncy.");
        }
    }

    public void jump() {
        if(!this.broken) {
            System.out.println("You bounce up and down on the bed...");
            this.jumps++;
            if (jumps > 3) {
                System.out.println("Ops...the bed broke.");
                this.broken = true;
            }
        } else {
            System.out.println("The bed is broken...");
        }
    }
}
