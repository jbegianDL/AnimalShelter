package com.company;

public class IDNumber {
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int incrementID(){
        id++;
        return id;
    }
}
