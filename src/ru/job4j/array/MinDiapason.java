package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish - 1; index ++) {
            if (array[index + 1] < min) {
                min = array[index + 1];
            }
        }
        return min;
        }

    public static void main(String[] args) {
        int[]mass = new int[]{7, 4, 5, 2, 8, 16, 27, 2, 1};
        System.out.println(findMin(mass, 3, 8));
    }
}
