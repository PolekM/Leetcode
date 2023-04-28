import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int [] nums ={1,1,1,2,2,3};
        topKFrequent(nums,2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();

        for (int i :nums) {
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        int[] arr =  m.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(integerIntegerEntry -> integerIntegerEntry.getKey())
                .mapToInt(value -> value)
                .limit(k)
                .toArray();
        return arr;
    }

}
