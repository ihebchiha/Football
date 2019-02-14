package com.company;

import java.util.List;

public class Referee extends Person {

    private int idRef;
    private List<String> matchesAssigned;

    public Referee(String fullname, String birthDate, String nationality) {
        super(fullname, birthDate, nationality);
    }
}
