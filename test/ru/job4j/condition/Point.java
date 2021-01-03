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
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 1, 2, 2);
        double result3 = Point.distance(3, 3, 6, 6);
        System.out.println("расстояние между точками (0,0) и (2,0) в системе координат равно " + result);
        System.out.println("расстояние между точкам  (1,1) и (2,2) в системе координат равно " + result2);
        System.out.println("расстояние между точками (3,3) и (6,6) в системе координат равно " + result3);
    }
}




