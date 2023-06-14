import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] tab = {3, 2, 1, 0, 4};
        System.out.println(canJump(tab));
    }

    public static boolean canJump(int[] nums) {

        int length = nums.length;
        int currentJump = length - 1;

        for (int i = length - 2; i >= 0; i--) {
            if (i + nums[i] >= currentJump) {
                currentJump = i;
            }
        }


        return currentJump == 0;
    }
}