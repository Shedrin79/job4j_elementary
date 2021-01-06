package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        int rsl = one > two ? one : two;
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = Max.max(11, 12);
        System.out.println(rsl);
    }

}
