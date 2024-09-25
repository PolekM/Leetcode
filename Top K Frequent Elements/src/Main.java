import java.util.*;

public class Main {

    public static void main(String[] args) {
        int [] nums ={1,1,1,2,2,3};
        int[] ints = topKFrequent(nums, 2);
        for (int i:ints) {
            System.out.println(i);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        int [] result = new int[k];
        List<Integer> bucket [] = new ArrayList[nums.length+1];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> mapEntry: map.entrySet()) {
            if(bucket[mapEntry.getValue()]==null){
                bucket[mapEntry.getValue()]= new ArrayList<>();
            }
            bucket[mapEntry.getValue()].add(mapEntry.getKey());
        }
        int counter=0;
        for(int i=bucket.length-1;i>=0 && counter<k;i--){
            if(bucket[i]!=null){
                for (Integer integer:bucket[i]) {
                    result[counter++] = integer;

                }
            }
        }

        return result;
    }

}
