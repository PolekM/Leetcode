public class Main {


    public static void main(String[] args) {
        int nums []= {2,7,11,15};
        int target = 9;
        twoSum(nums,target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] ExceptedNumber = new int[2];
        int l = nums.length;
        for(int i=0;i<l;i++){
            for (int j=i+1;j< l;j++){
                if(nums[i]+nums[j]==target){
                    ExceptedNumber[0]=i;
                    ExceptedNumber[1]=j;
                    break;
                }
            }
        }
        return ExceptedNumber;
    }
}