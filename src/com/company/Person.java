package com.company;

import java.util.Date;

public class Person {

    private String fullname;
    private Date birthDate;
    private String birthPlace;
    private String nationality;

    public Person(String fullname, Date birthDate, String birthPlace, String nationality) {
        this.fullname = fullname;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.nationality = nationality;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
