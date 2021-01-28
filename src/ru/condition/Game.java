package ru.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Старт - супер Марио");
        }
        if (name.equals("tank")) {
            System.out.println("Старт - танк");
        }
        if (name.equals("tetris")) {
            System.out.println("Старт - тетрис");
        }
    }

    public static void main(String[] args) {
        Game.menu("tank");
    }
}
