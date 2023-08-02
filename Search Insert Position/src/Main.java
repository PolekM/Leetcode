public class Main {

    public static void main(String[] args) {
        int[] tab = {1,3};
        System.out.println(searchInsert(tab, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int len = nums.length - 1;
        int mid = len / 2;


        while (mid <= 0 || mid <= len) {
            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target) {
                mid++;
                if(mid>len){
                    return mid;
                }
                else if(nums[mid]>target){
                    return mid;
                }


            } else {
                mid--;
                if(mid<0){
                    return 0;
                }
                else if(nums[mid]<target){
                    return ++mid;
                }

            }

        }


        return mid;
    }

}
