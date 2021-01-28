package ru.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean first = ab + ac > bc;
        boolean second = ab + bc > ac;
        boolean third = bc + ac > ab;
        return first && second && third;
    }

    public static void main(String[] args) {
        boolean rsl = Triangle.exist(2.5, 2.3, 2.90);
        System.out.println(rsl);

    }
}
