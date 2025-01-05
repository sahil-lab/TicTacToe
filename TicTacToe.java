package com.chess;

import java.util.Scanner;

public class TicTacToe {

    // Define the board
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X'; // Player X starts

        // Game loop
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + "'s turn. Enter your move (row and column): ");

            // Input row and column
            int row, col;
            while (true) {
                System.out.print("Row (0, 1, 2): ");
                row = scanner.nextInt();
                System.out.print("Column (0, 1, 2): ");
                col = scanner.nextInt();

                // Check if the input is valid
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            // Place the move
            board[row][col] = currentPlayer;

            // Check for a winner
            if (isWinner(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            // Check for a draw
            if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Switch players
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    // Print the current board
    static void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    // Check if the current player has won
    static boolean isWinner(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    // Check if the game is a draw
    static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // At least one cell is empty
                }
            }
        }
        return true; // All cells are filled
    }
}
