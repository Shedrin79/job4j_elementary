package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int [][] numbers = { {7}, {3, 5}, {6, 8, 2}, {9, 2, 4, 5}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("размер вложенного массива равен  " + numbers[i].length);
            
        }
    }
}
