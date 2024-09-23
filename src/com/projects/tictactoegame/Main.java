package com.projects.tictactoegame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.print("Enter player 1 name: ");
        Player player1 = new Player(scanner.nextLine(), 'X');

        System.out.print("Enter player 2 name: ");
        Player player2 = new Player(scanner.nextLine(), 'O');

        Player currentPlayer = player1;

        while (true) {
            board.printBoard();
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
            System.out.print("Enter row (0, 1, or 2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0, 1, or 2): ");
            int col = scanner.nextInt();

            if (board.placeMark(row, col)) {
                if (board.checkWin()) {
                    board.printBoard();
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                } else if (board.isBoardFull()) {
                    board.printBoard();
                    System.out.println("It's a tie!");
                    break;
                } else {
                    board.switchPlayer();
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

        scanner.close();
    }
}