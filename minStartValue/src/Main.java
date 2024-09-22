public class Main {
    public static void main(String[] args) {
        int [] tab = {1,2};
        System.out.println(minStartValue(tab));
    }

    public static int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            min = Math.min(min, sum);
        }

        return min * -1 + 1;
    }
}