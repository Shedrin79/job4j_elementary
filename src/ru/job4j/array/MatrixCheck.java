package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }


    public static boolean monovertical(char[][] board, int column) {
        boolean rsl = true;
        for (int x = 0; x < board.length; x++) {
            if (board[x][column] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
        rsl[i] = board[i][i];
        }
        return rsl;
        }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index ++) {
            if (board[index][index] == 'X') {
                if(monoHorizontal(board, index) || monovertical(board, index)) {
                    result = true;
                }
            }
        }
        return result;

        }
    }


