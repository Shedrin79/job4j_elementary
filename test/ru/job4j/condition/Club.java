package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasmany, boolean ourfriend) {
        if (hasmany || ourfriend) {
            System.out.println("я могу пойти в клуб");
        } else {
            System.out.println("я НЕ могу пойти в клуб");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, false);
        permission(false, true);

    }
}
