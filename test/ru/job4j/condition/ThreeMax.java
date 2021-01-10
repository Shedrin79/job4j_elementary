package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second && first > third) {
            result = second;
        }
        if (second > first && second < third) {
            result = third;
        }
        return result;
    }


    public static void main(String[] args) {
        int rsl = ThreeMax.max(7, 8, 9);
        System.out.println(rsl);
    }
}
