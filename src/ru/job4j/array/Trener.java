package ru.job4j.array;

import java.util.Arrays;

public class Trener {

    public static int[] chan(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sdacha = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (sdacha - coins[i] >= 0) {
                sdacha = sdacha - coins[i];
                rsl[size] = coins[i];
                size = size + 1;
                }
        }
        return Arrays.copyOf(rsl, size);
    }


    public static void main(String[] args) {

        int []result = chan(100, 19);
        for (int i = 0; i < result.length; i++) {
        System.out.println(result[i]);
        }

        }
    }



