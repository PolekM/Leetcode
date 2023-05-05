public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        shuffle(nums, 3);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffleNums = new int[nums.length];

        for (int i = 0, j = 0; j < n; i++, j++) {
            shuffleNums[i++] = nums[j];
            shuffleNums[i] = nums[n + j];
        }
        return shuffleNums;
    }
}