package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class League {

    ArrayList<Team> teams;
    HashMap<Team,Team> fixtures;

    public League(ArrayList<Team> teams, HashMap<Team, Team> fixtures, String playersFile, String file) {
        this.teams = readTeams(playersFile, file, teams);
        this.fixtures = fixtures;
    }

    public void setFixtures(HashMap<Team, Team> fixtures) {
        this.fixtures = fixtures;
    }


    public ArrayList<Team> readTeams(String playersFile, String file, ArrayList<Team> teams) {
        BufferedReader bufferedReader = null;
        try {
            if (bufferedReader == null) {
                bufferedReader = new BufferedReader(new FileReader(
                        file));
                String line = bufferedReader.readLine();
                while (line != null) {
                    System.out.println(line);
                    String[] dv = line.split("-");
                    teams.add(new Team(Integer.parseInt(dv[0]), dv[1], new ArrayList<Player>(), playersFile));
                    line = bufferedReader.readLine();
                }
                bufferedReader.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teams;
    }

    public void leagueToString() {
        for (Team team : teams) {
            System.out.println(team.getNameTeam());
        }
    }
}
