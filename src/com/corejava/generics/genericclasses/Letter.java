package com.corejava.generics.genericclasses;

public class Letter {

    private final String sender;

    public Letter(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                '}';
    }
}
