package com.company;

import java.util.Date;

public class Animal {
    private int idNumber;
    private String name;
    private String species;
    private String breed;
    private String color;
    private int age;
    private Date arrivalDate; //TODO figure out what Date does
    private String status;

    public Animal(String name, String species, String breed, String color, int age, Date arrivalDate, String status) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.arrivalDate = arrivalDate;
        this.status = "Available";
    }

    public void printAnimalDetails(){
        System.out.println("Animal ID Number: " + idNumber + "\n" +
                "Animal Name: " + name + "\n" +
                "Animal species: " + species + "\n" +
                "Animal breed: " + breed + "\n" +
                "Animal color: " + color + "\n" +
                "Animal age: " + age + "\n" +
                "Animal arrival date: " + arrivalDate + "\n" +
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

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
