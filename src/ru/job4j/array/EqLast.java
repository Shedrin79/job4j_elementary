package ru.job4j.array;

public class EqLast {

    public static boolean check(int[] left, int[] right) {
        boolean rsl = false;
        if (left[left.length - 1] == right[right.length - 1]){
            rsl = true;
        }
        return rsl;
}

    public static void main(String[] args) {
        int[] leftt = new int[]{1, 2, 3, 4, 0};
        int[] rightt = new int[]{1, 2, 3, 4, 5, 5, 4};
        System.out.println(check(leftt, rightt));
    }
    }
