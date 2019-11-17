package com.brunoyam.unit2.models;

public class Person {
    private  String name;
    private  String secondname;
    private  String surname;

    public Person (String name, String secondname, String surname) {
this.name = name;
this.secondname= surname;
this.surname = surname;


    }

    @Override
    public String toString() {
        return surname + " " + name + " " + secondname;
    }
    class Passport {
        
    }
}
