package ru.job4j.array;

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

    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i ++) {
            if (data[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(indexOf(new int[]{5, 4, 3, 2}, 2));
        System.out.println(indexOf(new int[]{1, 2, 3, 7, 5, 6}, 8, 0, 3 ));
    }

}





