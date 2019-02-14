package com.company;

import com.company.exceptions.LeagueNotStarted;
import com.company.util.OpsImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class League {

    ArrayList<Team> teams;
    List<Team[]> fixtures;

    List<Team[]> teams1 = new ArrayList<>();

    public League(ArrayList<Team> teams, List<Team[]> fixtures, String playersFile, String file) throws LeagueNotStarted {
        this.teams = readTeams(playersFile, file, teams);
        this.fixtures = setupFixtures(fixtures);
    }

    public void setFixtures(List<Team[]> fixtures) {
        this.fixtures = fixtures;
    }

    public List<Team[]> setupFixtures(List<Team[]> teams1) throws LeagueNotStarted {
        if (teams == null) {
            throw new LeagueNotStarted("League is not started yet");
        } else {
            int count = 0;
            int firstTeam;
            int secondTeam;
            boolean duplicated;
            Random random = new Random();
            while (count < 12) {
                do {
                    duplicated = false;
                    firstTeam = random.nextInt(4);
                    do {
                        secondTeam = random.nextInt(4);
                    } while (firstTeam == secondTeam);
                    for (Team[] teamsC : teams1) {
                        if (teamsC[0].getIdTeam() == firstTeam && teamsC[1].getIdTeam() == secondTeam) {
                            duplicated = true;
                            break;
                        }
                    }
                } while (duplicated);
                count++;
                Team[] tabTeams = new Team[2];
                tabTeams[0] = teams.get(firstTeam);
                tabTeams[1] = teams.get(secondTeam);
                teams1.add(tabTeams);

                if (count % 3 == 0) {
                    System.out.println("*/*/*//**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
                }

            }
        }

        return teams1;
    }

    public ArrayList<Team> readTeams(String playersFile, String file, ArrayList<Team> teams) {
        BufferedReader bufferedReader = null;
        try {
            if (bufferedReader == null) {
                bufferedReader = new BufferedReader(new FileReader(
                        file));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] dv = line.split("-");
                    teams.add(new Team(Integer.parseInt(dv[0]), dv[1], new ArrayList<Player>(), playersFile));
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

    public void showFixtures() {
        for (Team[] teamsC : fixtures) {
            System.out.println(teamsC[0].getNameTeam() + " VS " + teamsC[1].getNameTeam());
        }
    }

    public void playMatches() {
        OpsImpl ops = new OpsImpl();
        for (Team[] teamsC : fixtures) {
            Random random = new Random();
            int nbFixtures = 0;
            int nbGoalsFirstTeam = random.nextInt(10);
            int nbGoalsSecondTeam = random.nextInt(10);
            int winningTeam = whoWonTheMatch(nbGoalsFirstTeam, nbGoalsSecondTeam);
            String winner = "";
            if (winningTeam == 1) {
                anounceWinner(winner, ops, teamsC[0].getNameTeam(), teamsC[1].getNameTeam(), nbGoalsFirstTeam, nbGoalsSecondTeam);
            }
            if (winningTeam == 2) {
                anounceWinner(winner, ops, teamsC[1].getNameTeam(), teamsC[0].getNameTeam(), nbGoalsSecondTeam, nbGoalsFirstTeam);

            }
            if (winningTeam == 0) {
                anounceWinner(winner, ops, teamsC[1].getNameTeam(), teamsC[0].getNameTeam(), nbGoalsSecondTeam, nbGoalsFirstTeam);
            }
        }
    }

    public int whoWonTheMatch(int nbGoalsFirst, int nbGoalsSecond) {
        int winningTeam = 0;
        if (nbGoalsFirst > nbGoalsSecond) {
            winningTeam = 1;
        } else if (nbGoalsFirst < nbGoalsSecond) {
            winningTeam = 2;
        }
        return winningTeam;
    }

    public String showWinner(String team1, String team2, int nbGf, int nbGs) {
        String winner = team1 + " " + nbGf + " - " + nbGs + " " + team2;
        return (winner);
    }

    public void anounceWinner(String winner, OpsImpl ops, String teamOne, String teamTwo, int nbgOne, int nbgTwo) {
        winner = showWinner(teamOne, teamTwo, nbgOne, nbgTwo);
        System.out.println(winner);
        ops.writeOnFile("C:/Users/iheb.chiha/IdeaProjects/Football/Teams/results.txt", winner);
    }


}
