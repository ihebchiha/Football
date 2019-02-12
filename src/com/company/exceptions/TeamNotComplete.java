package com.company.exceptions;

public class TeamNotComplete extends Exception {

    String message;

    public TeamNotComplete(String message, String message1) {
        super(message);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
