package ru.status;

public class TrgArea {
    public static double zone(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double first = p * (p - a) * (p - b) * (p - c);
        double second = Math.sqrt(first);
        return second;
    }

    public static void main(String[] args) {
        double result = TrgArea.zone(3, 3, 3);
        System.out.println(" площадь треугольника со сторонами 2 2 2 равна " + result);

    }
}
