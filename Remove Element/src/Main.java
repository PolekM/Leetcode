public class Main {

    public static void main(String[] args) {
        int nums [] = {3,2,2,3};
        removeElement(nums,3);
    }

    public static int removeElement(int[] nums, int val) {
        int removedNum = 0;
        int sizeOfArray = nums.length;
        for(int i=0; i < sizeOfArray; i++ ){
            if(nums[i] != val){
                nums[removedNum] = nums[i];
                removedNum+=1;
            }


        }
        return removedNum;
    }
}
