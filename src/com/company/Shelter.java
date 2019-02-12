package com.company;

import java.util.ArrayList;

public class Shelter {
    private ArrayList<Animal> shelter = new ArrayList<>(75);

    public void addAnimal(Animal animal){
        shelter.add(animal);
        System.out.println("Total animals: " + shelter.size() + "\n");
    }

    public void removeAnimal(int index){
        Animal removedAnimal = shelter.remove(index);
        System.out.println("Animal " + removedAnimal.getName() + " has been removed");
    }

    public void searchByID(int id){

        for (int i = 0; i < shelter.size() ; i++) {
            if(shelter.get(i).getIdNumber() == id){
               shelter.get(i).printAnimalDetails();
            } else {
                System.out.println("Cannot find...");
            }
        }
    }

    public void printShelter(){
        for(Animal animal: shelter){
            animal.printAnimalDetails();
        }
    }

    public void printIndexAndName(){
        for (int i = 0; i < shelter.size(); i++) {
            System.out.println("Index: " + i + "\n" +
                   "Name: " + shelter.get(i).getName() + "\n");
        }
    }


}
