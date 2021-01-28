package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {

        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Petr First";
        names[2] = "Petr Second";
        names[3] = "Petr Third";
        System.out.println(names[0]);
        String name = names[1];
        System.out.println(name);
        System.out.println(names[2]);
        String name1 = names[3];
        System.out.println(name1);

    }
}
