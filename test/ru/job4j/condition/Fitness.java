package ru.job4j.condition;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan = ivan *= 3;
            nik = nik *= 2;
            month = month + 1;
        }
        return month;
    }


    public static void main(String[] args) {
        int rsl = Fitness.calc(90, 90);
        System.out.println("При такой протеиновой диете Иван перегонит Николая через " + rsl + " месяц");

    }
}
