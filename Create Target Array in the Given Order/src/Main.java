import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            int [] nums = {0,1,2,3,4};
            int [] index = {0,1,2,2,1};
            createTargetArray(nums,index);
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList();
        int lenght = nums.length;
        for(int i =0;i< lenght;i++){
            target.add(index[i],nums[i]);
        }

        return target.stream().mapToInt(value -> value).toArray();
    }

}
