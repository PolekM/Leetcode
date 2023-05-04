import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int n = 4;
        int[] rounds = {1,3,1,2};
        System.out.println(mostVisited(n,rounds));
    }

    public static List<Integer> mostVisited(int n, int[] rounds) {
        int i = 1;
        int start = rounds[0];
        HashMap<Integer,Integer> map = new HashMap();
        while (i< rounds.length){
            while(start!=rounds[i]){
                map.put(start,map.getOrDefault(start,0)+1);
                if(start>=n){
                    start=0;
                }
                start++;
            }
            i++;
        }
        map.put(start,map.getOrDefault(start,0)+1);
        int max = map.entrySet().stream().mapToInt(Map.Entry::getValue).max().orElse(0);
        return map.entrySet().stream().filter(integerIntegerEntry -> integerIntegerEntry.getValue() == max).map(Map.Entry::getKey).sorted().collect(Collectors.toList());
    }

}
