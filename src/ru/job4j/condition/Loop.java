package ru.job4j.condition;

public class Loop {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = 0; index <= 5; index++) {
            sum = sum + index;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}




