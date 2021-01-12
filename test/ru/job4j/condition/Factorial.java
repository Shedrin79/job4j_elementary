package ru.job4j.condition;

public class Factorial {
    public static int calc(int start, int finish) {
        int rsl = 1;
        for (int index = start; index <= finish; index++) {
            rsl = rsl * index;
        }
        if (start == 0 && finish == 0) {
            return 1;
        }
        return rsl;

    }

    public static void main(String[] args) {
        System.out.println(calc(0, 0));
    }
}
