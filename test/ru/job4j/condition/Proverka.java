package ru.job4j.condition;

public class Proverka {

    public static int dz(int n) {
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl = rsl * index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(dz(5));
    }
}

