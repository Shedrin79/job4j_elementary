package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        return one > two ? one : two;

    }

    public static void main(String[] args) {
        int rsl = Max.max(15, 12);
        System.out.println(rsl);
    }

}
