package com.brunoyam.unit2.models;

public class  Soldier extends Person{
   Ranks rank;

    public Soldier(String name, String secondname, String surname, Ranks rank) {
        super(name, secondname, surname);
        this.rank = rank;




    }

    @Override
    public String toString() {
        return rank.getName() + " " + super.toString();
    }
}
