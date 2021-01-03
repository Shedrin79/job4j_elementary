package ru.job4j;

public class Calculate {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static int calc2(int a2, int b2, int c2, int x2) {
        return a2 * x2 * x2 + b2 * x2 + c2;
    }

    public static int calc3(int a3, int b3, int c3, int x3) {
        return a3 * x3 * x3 + b3 * x3 + c3;
    }

    public static int calc4(int a4, int b4, int c4, int x4) {
        return a4 * x4 * x4 + b4 * x4 + c4;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int result = Calculate.calc(a, b, c, x);
        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int result2 = Calculate.calc2(a2, b2, c2, x2);
        int a3 = 1;
        int b3 = 1;
        int c3 = 0;
        int x3 = 1;
        int result3 = Calculate.calc3(a3, b3, c3, x3);
        int a4 = 1;
        int b4 = 1;
        int c4 = 1;
        int x4 = 0;
        int result4 = Calculate.calc(a4, b4, c4, x4);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
