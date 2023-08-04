import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int tab[] = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(tab));
    }

    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }

        return map.entrySet().stream().filter(key -> key.getValue() == 1).toList().get(0).getKey();
    }
}
