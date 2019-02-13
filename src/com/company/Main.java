package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        String response = "";
        Scanner sc = new Scanner(System.in);
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
        int c;
        do {
            c = sc.nextInt();
            System.out.println("Repeat!!!");
        } while ((c < 0 && c > 4));

        switch (c) {
            case 0: {
                ArrayList<Team> competingTeams = new ArrayList<>();
                HashMap<Team, Team> fixtures = new HashMap<>();
                League league = new League(competingTeams, fixtures, "C:/Users/iheb.chiha/IdeaProjects/Football/Teams/FC Barcelona.txt", "C:/Users/iheb.chiha/IdeaProjects/Football/Teams/Teams.txt");
                league.leagueToString();
            }
            case 1:
            default:
        }

    }

//    void checkExistingCompetition()
//    {
//        if ()
//    }
}
