package com.company;

public class Player extends Person{

    private String idLicence;
    private int number_on_shirt;
    private String position;
    private int nbGoals;
    private int nbAssists;

    public Player(String idLicence, int number_on_shirt, String position, int nbGoals, int nbAssists, String fullname, String birthDate, String nationality) {
        super(fullname, birthDate, nationality);
        this.idLicence = idLicence;
        this.number_on_shirt=number_on_shirt;
        this.position = position;
        this.nbGoals = nbGoals;
        this.nbAssists = nbAssists;
    }

    public String getIdLicence() {
        return idLicence;
    }

    public void setIdLicence(String idLicence) {
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
        System.out.println("Full Name: " + super.getFullname());
        System.out.println("Born: " + super.getBirthDate() + " in " + super.getNationality());
        System.out.println("Position: " + position + " " + number_on_shirt);
        System.out.println("Number of Goals/Assists: " + nbGoals + "/" + nbAssists);
        System.out.println("------------------------------------------------------------------");
    }
}
