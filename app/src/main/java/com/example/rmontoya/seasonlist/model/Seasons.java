package com.example.rmontoya.seasonlist.model;

public enum Seasons {

    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn"),
    WINTER("Winter");

    private String name;

    Seasons(String seasonName) {
        this.name = seasonName;
    }

    public String getName() {
        return name;
    }

}