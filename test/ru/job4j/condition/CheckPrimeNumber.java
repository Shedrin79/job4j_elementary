package ru.job4j.condition;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean a = false;
        for (int index = 2; index <= number; index++) {
            if (number % index == 0) {
                break;
            } else {
                a = true;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(check(7));
    }
}



