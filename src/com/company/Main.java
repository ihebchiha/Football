package com.company;

import com.company.exceptions.LeagueNotStarted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void choiceFromMenu(Scanner sc, String response) {
        do {
            response = sc.nextLine();
            if (!response.toLowerCase().equals("yes")) {
                System.out.println("Please enter 'Yes' correctly to pass :)");
                System.out.print("=> ");
            }
        } while (!response.toLowerCase().equals("yes"));

        System.out.println("Check out our menu !!!");

        MenuCompetition menu = new MenuCompetition();
        menu.showMenuCompetition();
    }

    public static void main(String[] args) throws LeagueNotStarted {
        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*      Welcome to our Football Competition       *");
        System.out.println("*             " + "&Champions League&" + "                 *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");

        System.out.println("To know more about teams, competition and anything, Please enter our app by pressing 'Yes'");
        System.out.print("=> ");
        boolean end = false;
        while (!end) {
            String response = "";
            Scanner sc = new Scanner(System.in);
            MenuCompetition menu = new MenuCompetition();
            choiceFromMenu(sc, response);

            int c = 0;
            do {
                if (c < 0 && c > 4)
                    System.out.println("Repeat!!!");

                c = sc.nextInt();
            } while (!(c >= 0 && c <= 4));

            switch (c) {
                case 0: {
                    ArrayList<Team> competingTeams = new ArrayList<>();
                    List<Team[]> fixtures = new ArrayList<>();
                    League league = new League(competingTeams, fixtures, "C:/Users/iheb.chiha/IdeaProjects/Football/Teams/FC Barcelona.txt", "C:/Users/iheb.chiha/IdeaProjects/Football/Teams/Teams.txt");
                    System.out.println("***************Competing Teams***************");
                    league.leagueToString();
                    System.out.println("***************Fixtures**********************");
                    league.showFixtures();
                    league.playMatches();
                    break;
                }
                case 1:
                case 2:
                case 3: {
                    String resp = "";
                    do {
                        resp = sc.nextLine();
                        if (!response.toLowerCase().equals("yes") || !response.toLowerCase().equals("no")) {
                            System.out.print("=> ");
                        }
                    } while (!(resp.toLowerCase().equals("yes") || (resp.toLowerCase().equals("no"))));

                    if (resp.equals("yes")) {
                        end = true;
                    }
                    break;
                }


            }
        }

        System.out.println("See you again in our App");
        System.exit(0);
    }
}
