package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class ShelterDemo {
    private static IDNumber idNumber = new IDNumber();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shelter shelter = new Shelter();
        boolean repeat = true;

        do {
            System.out.println("---Welcome to the Shelter Admin Portal--- \n" +
                    "Please enter a number of what you'd like to do \n" +
                    "1 - Add Animal Profile \n" +
                    "2 - Remove Animal Profile \n" +
                    "3 - Search by ID Number \n" +
                    "4 - View and Edit Profiles \n" +
                    "5 - View all animals alphabetically \n" +
                    "6 - View animals by status \n" +
                    "7 - View animals logged for > 6 months \n" +
                    "8 - Exit");

            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput){
                case 1:
                    createAnimal(shelter, scanner);
                    shelter.printShelter();
                    break;
                case 2:
                    deleteAnimal(shelter, scanner);
                    shelter.printShelter();
                    break;
                case 3:
                    searchAnimals(shelter, scanner);
                    break;
                case 8:
                    System.out.println("Goodbye");
                    repeat = false;
                    break;
            }
        }while(repeat);
    }


    public static void createAnimal(Shelter shelter, Scanner scanner){

        System.out.println("Please enter animal name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter animal species: ");
        String species = scanner.nextLine();
        System.out.println("Please enter animal breed: ");
        String breed = scanner.nextLine();
        System.out.println("Please enter animal color: ");
        String color = scanner.nextLine();
        System.out.println("Please enter animal age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter animal arrival year (YYYY): ");
        int year = scanner.nextInt();
        System.out.println("Please enter animal arrival month (MM): ");
        int month = scanner.nextInt();
        System.out.println("Please enter animal arrival day (DD): ");
        int day = scanner.nextInt();

        Animal animal = new Animal(name, species, breed, color, age, year, month, day);
        animal.setIdNumber(idNumber.incrementID());

        shelter.addAnimal(animal);
    }

    public static void deleteAnimal(Shelter shelter, Scanner scanner){
        System.out.println("Enter the index of the animal you'd like to delete: ");
        shelter.printIndexAndName();

        int index = scanner.nextInt();

        shelter.removeAnimal(index);
    }

    public static void searchAnimals(Shelter shelter, Scanner scanner){
        System.out.println("Please enter an ID Number: ");
        int id = scanner.nextInt();

        shelter.searchByID(id);
    }
}
