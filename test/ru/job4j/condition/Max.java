package ru.job4j.condition;

public class Max {
    public static String max(int one, int two) {
        String label = one > two ? "Значение one максимально" : "Значение two максимально";
        return label;
    }

    public static void main(String[] args) {
        String label = Max.max(9, 10);
        System.out.println(label);
    }

}
