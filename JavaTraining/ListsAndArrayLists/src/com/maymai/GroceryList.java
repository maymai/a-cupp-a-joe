package com.maymai;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void printList() {
        System.out.println("There are " + groceryList.size() + " items in the list.");
        for(int i=0;i<groceryList.size();i++) {
            System.out.println("Item " + (i + 1) + ": " + groceryList.get(i));
        }
    }

    public void changeItem(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Item " + item + " position changed to " + (position + 1));
    }

    public void changeItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        changeItem(position, newItem);
    }

    public void removeItem(String item) {
        int position = findItem(item);
        removeItem(position);
    }

    public void removeItem(int position) {
        groceryList.remove(position);
    }

    public int findItem(String item) {
        return groceryList.indexOf(item);
    }
}


