package ru.job4j.condition;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {

        int age = 0;
        while (amount > 0) {
            amount = amount + (amount * percent / 100);
            amount = amount - salary;
            age = age + 1;
        }
        return age;
    }

    public static void main(String[] args) {
        System.out.println(year(1000, 1200, 1));

    }
}
