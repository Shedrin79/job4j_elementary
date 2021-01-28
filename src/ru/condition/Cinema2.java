package ru.condition;

public class Cinema2 {
    public static void permission(boolean parents, boolean maney) {
        if (parents && maney) {
            System.out.println("я могу пойти в кино");
        } else {
            System.out.println("я не могу пойти в кино ");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);

    }
}
