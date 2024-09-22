import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int array[] = {1, 2, 3};
        List<List<Integer>> permute = permute(array);
        System.out.println(permute);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();

        backTrack(result, temp, nums);
        return result;
    }

    public static void backTrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new LinkedList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!temp.contains(nums[i])) {
                temp.add(nums[i]);
                backTrack(result, temp, nums);
                temp.remove(temp.size() - 1);

            }
        }

    }
}