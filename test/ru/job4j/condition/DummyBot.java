package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = ("Это ставит меня в тупик. Задайте другой вопрос");
        if (question.equals("привет бот")) {
            rsl = ("привет умник");
        }
        if (question.equals("пока бот")) {
            rsl = ("до скорой встречи");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("привет бот");
        System.out.println(rsl);
        String rsl2 = DummyBot.answer("пока бот");
        System.out.println(rsl2);
        String rsl3 = DummyBot.answer("как дела?");
        System.out.println(rsl3);
    }
}
