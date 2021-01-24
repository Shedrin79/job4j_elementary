package ru.job4j.array;

import org.w3c.dom.ls.LSOutput;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(indexOf(new int[]{5, 4, 3, 2}, 2));
    }

}





