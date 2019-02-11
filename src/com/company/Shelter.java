package com.company;

import java.util.ArrayList;

public class Shelter {
    private ArrayList<Animal> shelter = new ArrayList<>(75);

    public void addAnimal(Animal animal){
        shelter.add(animal);
        System.out.println("Total animals: " + shelter.size());
    }


}
