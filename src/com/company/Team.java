package com.company;

import com.company.exceptions.PlayerNotFound;
import com.company.util.OpsImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {

    private int idTeam;
    private String nameTeam;
    private ArrayList<Player> players;
    private Coach coach;
    private String formation;

    public Team() {
    }

    public Team(int idTeam, String nameTeam, ArrayList<Player> players, Coach coach, String formation) {
        this.idTeam = idTeam;
        this.nameTeam = nameTeam;
        this.players = players;
        this.coach = coach;
        this.formation = formation;
    }

    public Team(int idTeam, String nameTeam, ArrayList<Player> players, String file) {
        this.idTeam = idTeam;
        this.nameTeam = nameTeam;
        this.players = (ArrayList<Player>) initializePlayers(file, players);
    }

    public Team createTeam(ArrayList<Player> playerz) {
        System.out.println("Create your team:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String teamName = sc.nextLine();
        String formation = sc.nextLine();
        Coach coach = new Coach("coach", "", "");

        return new Team(id, teamName, playerz, coach, formation);
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

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public void searchPlayerByName(String name) throws PlayerNotFound {
        for (Player player : players) {
            if (player.getFullname().toLowerCase() == name.toLowerCase()) {
                System.out.println("Player Found");
                player.showPlayerInfos();
                break;
            } else {
                System.out.println(new PlayerNotFound("Player doesn't play for this Team").getMessage());
            }
        }
    }

    public void searchPlayerByNumber(int numberOnShirt) {
        for (Player player : players) {
            if (player.getNumber_on_shirt() == numberOnShirt) {
                System.out.println("Player Found");
                player.showPlayerInfos();
                break;
            } else {
                System.out.println(new PlayerNotFound("There is no player with this number in the squad").getMessage());
            }
        }
    }

    public void historyTeam(String file) {
        for (Player player : players) {
            player.showPlayerInfos();
        }
    }
}
