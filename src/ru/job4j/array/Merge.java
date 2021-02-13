package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int z = 0;
        while (i < left.length && j < right.length) {
            rsl[z++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            rsl[z++] = left[i++];
        }
        while (j < right.length) {
            rsl[z++] = right[j++];
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] left = {17};
        int[] right = {5, 6, 7, 8, 9, 10, 11, 12};
        int[] rzl = merge(left, right);
        for (int i = 0; i < rzl.length; i++) {
            System.out.print(rzl[i]);

        }

    }
}

