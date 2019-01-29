package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class League {

    ArrayList<Team> teams;
    HashMap<Team,Team> fixtures;


    public void initializeTeams() {
        // We are going to use files to initialize teams
    }

    public void setFixtures(HashMap<Team, Team> fixtures) {
        this.fixtures = fixtures;
    }
}
