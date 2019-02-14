package com.company;

public class Coach extends Person {

    private int yearSignIn;

    public Coach(String fullname, String birthDate, String nationality, int yearSignIn) {
        super(fullname, birthDate, nationality);
        this.yearSignIn = yearSignIn;
    }

    public int getYearSignIn() {
        return yearSignIn;
    }

    public void setYearSignIn(int yearSignIn) {
        this.yearSignIn = yearSignIn;
    }
}
