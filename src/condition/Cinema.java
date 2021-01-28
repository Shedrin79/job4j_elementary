package condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("Возраст посетителя " + age + " лет");
        if (age >= 18) {
            System.out.println("Добро пожаловать в кинотеатр!");
        } else {
            System.out.println("Вход запрещен!");
        }
    }

    public static void main(String[] args) {

        Cinema.access(100);
    }
}