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
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 рублей - это " + euro + " евро");
        System.out.println("если 140 рублей это 2 евро. Результат теста - " + passed);
        int dollar = Converter.rubleToDollar(120);
        int in2 = 120;
        int expected2 = 2;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 рублей - это " + dollar + " доллар");
        System.out.println("если 120 рублей это 3 доллара. Результат теста - " + passed2);
    }

}
