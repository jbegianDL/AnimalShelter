package com.company;

import java.util.Calendar;

public class Animal {
    private int idNumber;
    private String name;
    private String species;
    private String breed;
    private String color;
    private int age;
    private Calendar.Builder arrivalDate;
    private String status;

    public Animal(String name, String species, String breed, String color, int age) {
        this.idNumber = getIdNumber();
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.arrivalDate = getArrivalDate();
        this.status = "Available";
    }

    public void printAnimalDetails(){
        System.out.println("Animal ID Number: " + getIdNumber() + "\n" +
                "Animal Name: " + name + "\n" +
                "Animal species: " + species + "\n" +
                "Animal breed: " + breed + "\n" +
                "Animal color: " + color + "\n" +
                "Animal age: " + age + "\n" +
                "Animal arrival date: " + getArrivalDate() + "\n" +
                "Animal stats: " + status + "\n");
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Calendar.Builder getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Calendar.Builder arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
