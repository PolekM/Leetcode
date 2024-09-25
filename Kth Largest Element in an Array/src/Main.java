import java.util.*;

public class Main {
    public static void main(String[] args) {
        int tab [] = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(tab,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i=0; i< nums.length;i++){
            q.offer(nums[i]);
            while(q.size()>k){
                q.poll();
            }

        }
        return q.peek();
    }

}