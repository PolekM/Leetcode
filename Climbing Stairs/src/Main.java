public class Main {
    public static void main(String[] args) {
        int i = climbStairs(4);
        System.out.println(i);
    }

    public static int climbStairs(int n) {
        int sum = 0, prev = 2, prevPrev = 1;
        if (n == 1) return 1;
        if (n == 2) return 2;

        for (int i = 3, j = 4; i <= n; i++, j++) {
            sum = prev + prevPrev;
            prevPrev = prev;
            prev = sum;

        }
        return sum;
    }
}