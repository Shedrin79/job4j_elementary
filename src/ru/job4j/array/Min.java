package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] mass = new int[]{6, 2, 3, 4, 5, 6, 1, 9};
        System.out.println(findMin(mass));
    }
}
