package ru.job4j.condition;

public class SqArea {
    public static double square ( double p, double k ){
        double first = k + 1;
        double second = 2 * first;
        double h = ( p / second);
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main (String [] args){
        double s = SqArea.square ( 6, 2 );
        System.out.println (" если периметр = 6, а коэффициент k = 2, то площадь равна " + s);

    }
}
