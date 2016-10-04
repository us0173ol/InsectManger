package com.miked;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
        //new butterfly objects
        Butterfly monarch = new Butterfly("Monarch", "orange and black", 4, "milkweed");
        //monarch.printSpeciesData();

        Butterfly swallowTail = new Butterfly("Common Yellow Swallowtail", "yellow and black", 4, "milk parsley");
        //swallowTail.printSpeciesData();
        //new bee objects
        Bee honeyBee = new Bee("Honey Bee", 4, "Jasmine", "yellow and black", true);
        //honeyBee.printSpeciesData();

        Bee bumbleBee = new Bee("Bumble bee", 4, "clover", "black and white", false);
        //bumbleBee.printSpeciesData();

        //new Linkedlist of Insect Objects to store both butterflies and bees
        LinkedList<Insect> insects = new LinkedList<>();
        insects.add(monarch);
        insects.add(swallowTail);
        insects.add(honeyBee);
        insects.add(bumbleBee);
        //for each Insect Object in insects List, print species data
        insects.forEach(Insect::printSpeciesData);
    }
}
