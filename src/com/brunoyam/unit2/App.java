package com.brunoyam.unit2;

import com.brunoyam.unit2.models.Person;
import com.brunoyam.unit2.models.Ranks;
import com.brunoyam.unit2.models.Soldier;

public class App {
    public static void main (String [] args) {
        Person ivanov = new Person("Ivan", "Ivanovich", "Ivanov");
        System.out.println(ivanov.toString());

        Soldier bruce = new Soldier("Bruce", "Petrovich", "Willis", Ranks.general);
        System.out.println(bruce.toString());



    }
}
