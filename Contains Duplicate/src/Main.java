import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        containsDuplicate(nums);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                return true;
            }
        }

        return false;

    }

}
