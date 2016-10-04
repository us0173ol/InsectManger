package com.miked;

/**
 * Created by miked on 10/4/2016.
 */
public class Bee extends Insect {
    //variables for all Bee objects
    String color;
    boolean makeshoney;
    String favFlower;
    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMakeshoney() {
        return makeshoney;
    }

    public void setMakeshoney(boolean makeshoney) {
        this.makeshoney = makeshoney;
    }

    public String getFavFlower() {
        return favFlower;
    }

    public void setFavFlower(String favFlower) {
        this.favFlower = favFlower;
    }
    //constructor
    public Bee(String name, int numberOfWings, String favFlower, String color, boolean makeshoney) {

        this.name = name;
        this.numberOfWings = numberOfWings;
        this.favFlower = favFlower;
        this.color = color;
        this.makeshoney = makeshoney;
    }
    //determine which statement to print if the bee makes honey or not
    public void printSpeciesData() {
        if (makeshoney == false){
        System.out.println("A " + this.name + " has " + this.legs + " legs, " + this.numberOfWings +
                " wings, it is " + this.color + ", and likes a plant called " + this.favFlower + ".  This bee does not make honey." );
    }else{
            System.out.println("A " + this.name + " has " + this.legs + " legs, " + this.numberOfWings +
                    " wings, it is " + this.color + ", and likes a plant called " + this.favFlower + ".  This bee does make honey." );
        }
    }
}
