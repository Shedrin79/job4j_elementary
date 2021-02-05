package ru.job4j;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = point; i < array.length; i ++) {
                    if (array[i] != null) {
                        int point2 = i;
                        String basa = array[point];
                        array[point] = array[i];
                        array[i] = basa;
                        break;
                    }
                }
            }
        }
        return array;
    }
    }







