package ru.job4j.condition;

public class Mortgage {

    public static double year(double amount, double salary, double percent) {

        int age = 0;
        double ostatok = amount + amount * percent;
        while (ostatok > 0) {
            ostatok = ostatok - salary;
            age = age + 1;
        }
        return age;
    }

    public static void main(String[] args) {
        System.out.println(year(100, 70, 0.5));

    }
}
