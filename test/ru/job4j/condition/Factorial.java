package ru.job4j.condition;

public class Factorial {
    public static int calc(int finish) {
        int rsl = 1;
        for (int index = 1; index <= finish; index++) {
            rsl = rsl * index;
        }

        return rsl;

    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}
