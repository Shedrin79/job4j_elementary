package ru.job4j.status;

public class TrgArea {
    public static double zone ( double a, double b, double c){
        double p = (a + b + c) / 2;
        double first = p * (p-a)*(p-b)*(p-c);
        double second = Math.sqrt (first);
        return second;
            }
    public static void main (String [] args){
        double result = TrgArea.zone (2,2,2);
        System.out.println (" площадь треугоьника со сторонами 2 2 2 равна " + result);

    }
}
