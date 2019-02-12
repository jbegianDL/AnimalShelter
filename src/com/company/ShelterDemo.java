package com.company;

import java.util.Scanner;

public class ShelterDemo {

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
                case 8:
                    System.out.println("Goodbye");
                    repeat = false;
                    break;
            }
        }while(repeat);
    }


    public static void createAnimal(Shelter shelter, Scanner scanner){
        IDNumber idNumber = new IDNumber();
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
        System.out.println("Please enter animal arrival date (YYYY/MM/DD): ");
        String arrivalDate = scanner.nextLine();

        Animal animal = new Animal(name, species, breed, color, age, arrivalDate);
        animal.setIdNumber(idNumber.incrementID());

        shelter.addAnimal(animal);
    }
}
