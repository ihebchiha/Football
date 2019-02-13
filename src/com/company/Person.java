package com.company;

public class Person {

    private String fullname;
    private String birthDate;
    private String nationality;

    public Person(String fullname, String birthDate, String nationality) {
        this.fullname = fullname;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
