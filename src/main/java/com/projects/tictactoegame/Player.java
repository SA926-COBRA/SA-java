package com.projects.tictactoegame;

public class Player {
    private String name;
    private char symbol; // 'X' or 'O'

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}

