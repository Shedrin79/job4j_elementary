package ru.job4j.condition;

public class Mortgage {

    public static double year(double amount, double salary, double percent) {

        int age = 1;
        for (double ostatok = amount + percent * amount; ostatok <= 0; ostatok = ostatok - salary) {
            while (ostatok > 0) {
                age = age + 1;
            }
        }
        return age;
    }

    public static void main(String[] args) {
        System.out.println(year(100, 0, 0.5));

    }
}
