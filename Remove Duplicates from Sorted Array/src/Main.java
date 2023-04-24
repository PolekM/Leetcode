public class Main {

    public static void main(String[] args) {
        int nums [] = {1,1,2};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int i = 0;
        if (nums.length == 0)
            return 0;

        while (i < nums.length - 1)
        {
            if (nums[i] != nums[i + 1])
            {
                nums[k] = nums[i + 1];
                k++;
            }
            i++;

        }

        return k;
    }

}
