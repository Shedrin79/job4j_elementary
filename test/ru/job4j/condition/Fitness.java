package ru.job4j.condition;

public class Fitness {
    public static int calc(int ivan, int nik) {
        if (ivan < nik) {
            int month = 1;
            while ((ivan *= 3) < (nik *= 2)) {
                month = month + 1;
            }
            return month;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int rsl = Fitness.calc(50, 100);
        System.out.println("При такой протеиновой диете Иван перегонит Николая через " + rsl + " месяц");

    }
}
