package ru.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = (p / (2 * (k + 1)));
        double w = h * k;
        double s = w * h;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(200, 100);
        System.out.println(" если периметр = 6, а коэффициент k = 2, то площадь равна " + result);

    }
}
