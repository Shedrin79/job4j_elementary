package ru.condition;

public class LogicNot {

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return (notEven(num) && isPositive(num));
    }

    public static boolean evenOrNotPositive(int num) {
        return (isEven(num) || notPositive(num));
    }

    public static void main(String[] args) {
        boolean rsl = LogicNot.isPositive(1);
        System.out.println(rsl);
        boolean rsl2 = LogicNot.isEven(6);
        System.out.println(rsl2);
        boolean rsl3 = LogicNot.notEven(9);
        System.out.println(rsl3);
        boolean rsl4 = LogicNot.notPositive(-8);
        System.out.println(rsl4);
        boolean rsl5 = LogicNot.notEvenAndPositive(10);
        System.out.println(rsl5);
        boolean rsl6 = LogicNot.evenOrNotPositive(-3);
        System.out.println(rsl6);
    }

}
