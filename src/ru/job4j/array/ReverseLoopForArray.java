package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 7, 3, 9};
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
                System.out.println("Текущий элемент массива c четным индексом: " + numbers[numbers.length - 1 - i]
                );
            }
            }
        }
    }

