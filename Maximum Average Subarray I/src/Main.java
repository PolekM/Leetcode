public class Main {
    public static void main(String[] args) {
        int[] tab = {-1};
        System.out.println(findMaxAverage(tab,1));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double sum =0;
        double max = Double.NEGATIVE_INFINITY;
        int len = nums.length-1;
        for(int i =0;i<=len;i++) {
        if(i<k){
            sum=sum+nums[i];
        }
        else {

            max = Math.max(max,sum/k);
            sum = sum - nums[i-k] + nums[i];
        }
        }
        max = Math.max(max,sum/k);

        return max;
    }
}