package com.maymai;

public class Door {
    private boolean open;
    private boolean locked;
    private boolean hasKey;

    public Door(boolean open, boolean locked, boolean hasKey) {
        this.open = open;
        this.locked = locked;
        this.hasKey = hasKey;
    }

    public void open() {
        if(!this.open && !this.locked) {
            System.out.println("Door opens");
            this.open = true;
        } else if(this.open){
            System.out.println("Door is already open");
        } else if(this.locked) {
            System.out.println("Door is locked");
        }
    }

    public void close() {
        if(this.open) {
            System.out.println("Door closes");
            this.open = false;
        } else {
            System.out.println("Door is already closed");
        }
    }

    public void lock() {
        if(this.open) {
            if(this.hasKey) {
                close();
                this.locked = true;
                System.out.println("Door locks");
            } else {
                System.out.println("Need key to lock");
            }
        } else if(this.locked) {
            System.out.println("Door is already locked");
        }
    }

    public void unlock() {
        if(!this.locked) {
            System.out.println("Door is already unlocked");
        } else {
            if(this.hasKey) {
                System.out.println("Door unlocks");
                this.locked = false;
            } else {
                System.out.println("Need key to unlock");
            }
        }
    }
}
