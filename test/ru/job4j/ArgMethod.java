package ru.job4j;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Привет " + name);
    }

    public static void main(String[] args) {
        String name = "Петр";
        ArgMethod.hello(name);
    }

}
