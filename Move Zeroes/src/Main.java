import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int nums[] = {1, 2, 0, 4, 0, 5};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int num: nums) {
            if(num!=0){
                nums[i]=num;
                i++;
            }
        }
        for (;i<nums.length;i++){
            nums[i] =0;
        }

    }
}
