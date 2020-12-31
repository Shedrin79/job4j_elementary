package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = Math.pow(first, 2);
        double third = y2 - y1;
        double fourth = Math.pow(third, 2);
        double five = second + fourth;
        double six = Math.sqrt(five);
        return six;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 4, 6, 8);
        System.out.println("расстояние между точками (2,4) и (6,8) в системе координат равно " + result);
    }
}




