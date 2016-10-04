package com.miked;

/**
 * Created by miked on 10/4/2016.
 */
public class Butterfly extends Insect { //Butterfly inherits insect attributes
    //additional attributes for Butterflies
    String wingColor;
    String favFlower;

    //getters and setters
    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getFavFlower() {
        return favFlower;
    }

    public void setFavFlower(String favFlower) {
        this.favFlower = favFlower;
    }
    //constructor to create object with attributes
    public Butterfly(String name, String wingColor, int numberOfWings, String favFlower ){
        this.name = name;
        this.favFlower = favFlower;
        this.wingColor = wingColor;
        this.numberOfWings = numberOfWings;
    }
    //print this data only for butterflies
    public void printSpeciesData(){

        System.out.println("A " + this.name + " has " + this.legs + " legs, " + this.numberOfWings +
        " wings, it is " + this.wingColor + ", and likes a plant called " + this.favFlower);

    }

}
