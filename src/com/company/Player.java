package com.company;

import java.util.Date;

public class Player extends Person{

    private int idLicence;
    private int number_on_shirt;
    private String position;
    private int nbGoals;
    private int nbAssists;

    public Player(int idLicence, int number_on_shirt, String position, int nbGoals, int nbAssists, String fullname, Date birthDate, String birthPlace, String nationality) {
        super(fullname, birthDate, birthPlace, nationality);
        this.idLicence = idLicence;
        this.number_on_shirt=number_on_shirt;
        this.position = position;
        this.nbGoals = nbGoals;
        this.nbAssists = nbAssists;
    }

    public int getIdLicence() {
        return idLicence;
    }

    public void setIdLicence(int idLicence) {
        this.idLicence = idLicence;
    }

    public int getNumber_on_shirt() {
        return number_on_shirt;
    }

    public void setNumber_on_shirt(int number_on_shirt) {
        this.number_on_shirt = number_on_shirt;
    }

    public int getNbGoals() {
        return nbGoals;
    }

    public void setNbGoals(int nbGoals) {
        this.nbGoals = nbGoals;
    }

    public int getNbAssists() {
        return nbAssists;
    }

    public void setNbAssists(int nbAssists) {
        this.nbAssists = nbAssists;
    }

    public void showPlayerInfos() {
        System.out.println(super.getFullname());
        System.out.println(super.getBirthDate() + " in " + super.getBirthPlace());
        System.out.println(position + " " + number_on_shirt);
    }
}
