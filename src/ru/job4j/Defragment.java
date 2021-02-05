package ru.job4j;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (index = 0; index < array.length; index++) {
                    if (array[index] != null) {
                        int point2 = index;
                        String basa = array[point];
                        array[point] = array[point2];
                        array[point2] = basa;
                    }
                }
            }
        }
        return array;
    }
}







