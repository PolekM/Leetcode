public class Main {

    public static void main(String[] args) {
        int nums [] = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int cMax = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (cMax > 0)
                cMax += nums[i];
            else
                cMax = nums[i];
            max = Math.max(max, cMax);
        }
        return max;
    }
}
