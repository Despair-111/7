package com.company;

public class WrongLoginException extends Exception {
    private final String text;
    public WrongLoginException() {
        text = "Неверный логин";
    }

    public WrongLoginException(String message) {
        super(message);
        text = message;
    }
    public String Show(){
        return "WrongLoginException: " + text;
    }
}