public class Main {
    public static void main(String[] args) {
        mySqrt(8);
    }

    public static int mySqrt(int x) {
        long i = 0;
        long result = 0;
        if (x == 1) {
            return 1;
        }

        while (i < x) {
            if (i * i <= x)
                result = i;
            else
                return (int) result;
            i++;
        }

        return (int) result;

    }
}
