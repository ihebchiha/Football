package com.company.exceptions;

public class LeagueNotStarted extends Exception {

    String message;

    public LeagueNotStarted(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
