package ru.job4j.array;



public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int rsr = data[i];
            data[i] = data[index];
            data[index] = rsr;
        }

        return data;
    }

    public static void main(String[] args) {
        int[] mass = new int[]{6, 5, 4, 3, 2, 1};
        int[] rsl = sort(mass);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i]);
        }
    }
}



