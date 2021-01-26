package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length - i; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nuts = new int[]{3, 4, 5, 6, 7};
        int[] rsl = back(nuts);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}

