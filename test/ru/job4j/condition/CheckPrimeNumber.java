package ru.job4j.condition;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean rsl = false;
        for (int index = 2; index <= 5; index++) {
            if (number % index == 0) {
                break;
            } else {
                rsl = true;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(check(1));
    }
}



