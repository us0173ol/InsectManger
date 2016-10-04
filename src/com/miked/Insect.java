package com.miked;

/**
 * Created by miked on 10/4/2016.
 */
public abstract class Insect {//abstract class for general descirption
    //variables for all subclasses to inherit
    String name;
    int numberOfWings;
    public static int legs = 6;

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }
    //all insect objects  have this method bet each has unique data to print
    public abstract void printSpeciesData();

}
