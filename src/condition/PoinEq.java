package condition;

public class PoinEq {
    public static boolean eq(int x1, int y1, int x2, int y2) {
        boolean a = x1 == x2;
        boolean b = y1 == y2;
        return a == b;

    }

    public static void main(String[] args) {
        boolean rsl = PoinEq.eq(100, 100, 100, 100);
        System.out.println(rsl);

    }
}
