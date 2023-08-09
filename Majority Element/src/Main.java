import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] tab = {1, 2, 2,1,2};
        System.out.println(majorityElement(tab));
    }

    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],1)+1);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
