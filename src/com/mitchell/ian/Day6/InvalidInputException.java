package com.mitchell.ian.Day6;

public class InvalidInputException extends Exception {
    private String message;

    public InvalidInputException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
