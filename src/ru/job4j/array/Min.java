package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index + 1] < array[index]) {
                min = array[index + 1];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] mass = new int[]{6, 2, 3, 4, 5, 6, 1, 9, 0};
        System.out.println(findMin(mass));
    }
}
