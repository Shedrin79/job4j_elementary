package ru.job4j.condition;

public class Trenirovka {

    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        int[] leftt = new int[]{1, 2, 3, 4, 0, 4, 5};
        int[] rightt = new int[]{1, 2, 3, 4, 5, 5, 4};
        System.out.println(check(leftt, rightt));
    }
}
