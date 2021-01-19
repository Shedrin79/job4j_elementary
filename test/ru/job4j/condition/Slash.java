package ru.job4j.condition;

public class Slash {

    public static void draw(int size) {

        for (int row = size; row >= 0; row--) {
            for (int cell = size; cell >= 0; cell--) {
                if (row + cell == size - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                if (row == cell) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Draw by 5");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);

    }
}


