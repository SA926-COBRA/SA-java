package com.practice.exceptionhandling;

public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
