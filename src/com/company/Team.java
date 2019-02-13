package com.company;

import com.company.exceptions.PlayerNotFound;
import com.company.util.OpsImpl;

import java.util.ArrayList;

public class Team {

    private int idTeam;
    private String nameTeam;
    private ArrayList<Player> players;

    public Team(int idTeam, String nameTeam, ArrayList<Player> players, String file) {
        this.idTeam = idTeam;
        this.nameTeam = nameTeam;
        this.players = (ArrayList<Player>) initializePlayers(file, players);
    }

    public ArrayList<Player> initializePlayers(String file, ArrayList<Player> players) {
        return (new OpsImpl().readFromFile(file, players));
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

    public void searchPlayerByName(String name) throws PlayerNotFound {
        for (Player player : players) {
            if (player.getFullname().toLowerCase() == name.toLowerCase()) {
                System.out.println("Player Found");
                player.showPlayerInfos();
                break;
            } else {
                throw new PlayerNotFound("Player doesn't play for this Team");
            }
        }
    }

    public void searchPlayerByNumber(int numberOnShirt) {
        for (Player player : players) {
            if (player.getNumber_on_shirt() == numberOnShirt) {
                System.out.println("Player Found");
                player.showPlayerInfos();
                break;
            }
        }
    }
}
