package ru.job4j.array;

public class MatrixSum {
    public static int sum( int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row ++) {
            for (int cell = 0; cell < array[row].length; cell ++) {
                int val = array[row][cell];
                rsl = rsl + val;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] mass = {
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(sum(mass));

    }
}
