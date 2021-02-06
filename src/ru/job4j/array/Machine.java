package ru.job4j.array;


public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int size = 0;
        int[] rsl = new int[size];
        int sdacha = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (sdacha >= coins[i]) {
                sdacha = sdacha - coins[i];
                size = size + 1;
                rsl[size - 1] = coins[i];
               }
        }
        return rsl;
    }
}
