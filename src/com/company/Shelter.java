package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shelter {
    private ArrayList<Animal> shelter = new ArrayList<>(75);
    private Scanner scanner = new Scanner(System.in);

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

    public void viewAndEdit(int index){
        System.out.println("Please enter number of status change: \n" +
                "1 - Adoption Pending \n" +
                "2 - Foster Care \n" +
                "3 - Adopted");
        int edit = scanner.nextInt();
        if (edit == 1){
            shelter.get(index).setStatus("Adoption Pending");
        } else if (edit == 2){
            shelter.get(index).setStatus("Foster Care");
        } else if (edit == 3){
            shelter.get(index).setStatus("Adopted");
        } else {
            System.out.println("Incorrect Input");
        }

        shelter.get(index).printAnimalDetails();
    }

    public void sortAnimals(){
        ArrayList<String> animalAlpha = new ArrayList<>();
        for (Animal animal : shelter){
            animalAlpha.add("Name: " + animal.getName() + "\n" +
                    "Species: " + animal.getSpecies() + "\n" +
                    "Breed: " + animal.getBreed() + "\n");
        }

        Collections.sort(animalAlpha);

        for (String animal : animalAlpha){
            System.out.println(animal);
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
