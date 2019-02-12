package com.company.exceptions;

public class PlayerNotFound extends Exception {
    String message;

    public PlayerNotFound(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
