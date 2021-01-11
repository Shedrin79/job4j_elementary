package ru.job4j.condition;

public class Proverka {

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sumByEven = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sumByEven = sumByEven + index;
            }
        }
        return sumByEven;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println("ПЕРЕРЫВ");

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));

    }
}

