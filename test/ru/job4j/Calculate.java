package ru.job4j;

public class Calculate {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int result = Calculate.calc(a, b, c, x);
        a = 0;
        b = 1;
        c = 1;
        x = 1;
        int result2 = Calculate.calc(a, b, c, x);
        a = 1;
        b = 1;
        c = 0;
        x = 1;
        int result3 = Calculate.calc(a, b, c, x);
        a = 1;
        b = 1;
        c = 1;
        x = 0;
        int result4 = Calculate.calc(a, b, c, x);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
