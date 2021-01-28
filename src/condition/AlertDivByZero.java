package condition;

public class AlertDivByZero {

    public static void pussibleDiv(int number) {
        if (number == 0) {
            System.out.println("На ноль делить нельзя!");
        }
        if (number < 0) {
            System.out.println("Это отрицательные числа");
        }
    }

    public static void main(String[] args) {
        pussibleDiv(-2);
        pussibleDiv(0);

    }
}
