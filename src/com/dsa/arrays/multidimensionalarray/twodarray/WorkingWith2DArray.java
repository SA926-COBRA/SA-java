package com.dsa.arrays.multidimensionalarray.twodarray;

import java.util.Arrays;

public class WorkingWith2DArray {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';
        System.out.println(Arrays.deepToString(board));

        char[][] boardTwo = new char[][]{
                {'O', '2', '3'},
                {'O', '5', '6'},
                {'O', '8', '9'}
        };

        System.out.println(Arrays.deepToString(boardTwo));
    }
}
