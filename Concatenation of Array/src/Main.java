public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        getConcatenation(nums);
    }

    public static int[] getConcatenation(int[] nums) {

        int [] ans = new int[nums.length*2];
        int n = nums.length;

        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }
}
