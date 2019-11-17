package com.brunoyam.unit2.models;

public enum Ranks {
    captain ("Captain"),
    magior  ("Major"),
    general  ("General");


    String name;

    Ranks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
