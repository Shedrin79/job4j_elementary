package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        int result = (value / 70);
        return result;
    }

    public static int rubleToDollar(int value) {
        int result = (value / 60);
        return result;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 рублей - это " + euro + " евро");
        System.out.println("120 рублей - это " + dollar + " доллара");
    }

}
