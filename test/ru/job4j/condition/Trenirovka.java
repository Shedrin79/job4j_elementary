package ru.job4j.condition;

public class Trenirovka {

    public static void main(String[] args) {
        String[] names = {"Света", "Лена", "Вика", "Вероника"};
        for (int i = 0; i < names.length; i++) {
            names[i] = names + "  Привет!!!";
            System.out.println(names[i]);
        }
    }
}