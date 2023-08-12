public class Main {

    public static void main(String[] args) {

        int [] nums = {1,2,5,7,9,12,13};
        int target =1;
        System.out.println( search(nums,target));
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int middle = (start + end) / 2;
        while (start <= end) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
                middle = (start + end) / 2;
            } else if (nums[middle] < target) {
                start = middle + 1;
                middle = (start + end) / 2;

            }

        }


        return -1;
    }

}
