package com.company;

import java.util.ArrayList;

public class Team {

    private int idTeam;
    private String nameTeam;
    private ArrayList<Player> players;

    public Team(int idTeam, String nameTeam, ArrayList<Player> players) {
        this.idTeam = idTeam;
        this.nameTeam = nameTeam;
        this.players = players;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
