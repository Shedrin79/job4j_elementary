package ru.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "ошибка";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        String a = SwitchWeek.nameOfDay(1);
        String b = SwitchWeek.nameOfDay(2);
        String c = SwitchWeek.nameOfDay(3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(nameOfDay(7));
        System.out.println(nameOfDay(8));

    }
}

