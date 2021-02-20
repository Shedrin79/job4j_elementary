package ru.job4j.condition;

import java.util.Arrays;

public class Trenirovka {

    public static int[] calculate(int[] ars, int[] brulex) {
        int[] translak = new int[ars.length + brulex.length];
        int a = 0;
        int b = 0;
        int t = 0;

        while (a < ars.length && b < brulex.length) {
            translak[t++] = ars[a] < brulex[b] ? ars[a++] : brulex[b++];
        }
        while (a < ars.length) {
            translak[t++] = ars[a++];
        }
        while (b < brulex.length) {
           translak[t++] = brulex[b++];
        }

        return Arrays.copyOf(translak, translak.length +1);
    }

    public static void main(String[] args) {
        int[] brulex = {1, 2, 3, 4};
        int[] ars = {5, 6, 7, 8};
        int[] translak = calculate(brulex, ars);
        for (int i = 0; i < translak.length; i++) {
        System.out.print(translak[i]);
        }

    }
}
