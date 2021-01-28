package ru.condition;

public class Board {
    public static void paint(int x, int y) {
        for (int b = 0; b < y; b++) {
            for (int a = 0; a < x; a++) {
                if ((a + b) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 5);
    }
}


