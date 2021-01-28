package condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first <= second && first >= third) {
            result = second;
        }
        if (second >= first && second <= third) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = ThreeMax.max(3, 4, 4);
        System.out.println(rsl);
    }
}
