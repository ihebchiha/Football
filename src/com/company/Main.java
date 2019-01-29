package com.company;

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
        System.out.println("*             "+"&Champions League&"+"                 *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");

        System.out.println("To know more about teams, competition and anything, Please enter our app by pressing 'Yes'");
        System.out.print("=> ");
        String response="";
        Scanner sc=new Scanner(System.in);
        do{
            response=sc.nextLine();
            if (!response.toLowerCase().equals("yes")) {
                System.out.println("Please enter 'Yes' correctly to pass :)");
                System.out.print("=> ");
            }
        }while(!response.toLowerCase().equals("yes"));

        System.out.println("Check out our menu !!!");

        MenuCompetition menu=new MenuCompetition();
        menu.showMenuCompetition();
        String c;
        do {
            c=sc.next();
        }while(!(c.toLowerCase().equals("0") || c.toLowerCase().equals("1") || c.toLowerCase().equals("2")
                || c.toLowerCase().equals("3")));
    }

}
