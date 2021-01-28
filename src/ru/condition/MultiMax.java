package ru.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {

        if (first > second) {
            if (first > third) {
                return first;
            } else {
                return third;
            }
        } else {
            if (second > third) {
                return second;
            } else {
                return third;
            }
        }
    }

    public static void main(String[] args) {
        int rsl = MultiMax.max(108, 0, 103);
        System.out.println(rsl);
    }
}

