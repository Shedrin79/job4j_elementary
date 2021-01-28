package ru.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресение", "Sunday" -> 7;
            default -> -1;
        };

    }

    public static void main(String[] args) {
        int rsl = MultipleSwitchWeek.numberOfDay("Monday");
        int rsl1 = MultipleSwitchWeek.numberOfDay("Вторник");
        int rsl2 = MultipleSwitchWeek.numberOfDay("Wednesday");
        int rsl3 = MultipleSwitchWeek.numberOfDay("Четверг");
        int rsl4 = MultipleSwitchWeek.numberOfDay("Friday");
        int rsl5 = MultipleSwitchWeek.numberOfDay("Суббота");
        int rsl6 = MultipleSwitchWeek.numberOfDay("Sunday");
        int rsl7 = MultipleSwitchWeek.numberOfDay("Как дела");
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
        System.out.println(rsl5);
        System.out.println(rsl6);
        System.out.println(rsl7);

    }
}
