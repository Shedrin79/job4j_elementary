package ru.job4j.condition;

public class Proverka {
    public static boolean chek(int number) {
        boolean a = number > 1;
        for (int index = 2; index < number; index++) {
            if ((number % index) == 0) {
                a = false;
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(chek(7));

    }

}


