package ru.job4j.condition;

public class Proverka {

    public static void calc(int n) {
        int hold = 0;
        for (int index = 1; index <= n; index++) {
            hold = hold + index;
            if (hold == n) {
                System.out.println("Success");
                break;
            } else if (hold > n) {
                System.out.println("Not possible");
                break;
            }
            System.out.println(hold);
        }
    }

    public static void main(String[] args) {
        calc(6);
        calc(5);
    }
}