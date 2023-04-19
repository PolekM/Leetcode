import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String [] list = {"flower","flow","flight"};
        longestCommonPrefix(list);
    }

    public static String longestCommonPrefix(String[] strs) {
        int min = Arrays.stream(strs).map(String::length).min(Integer::compareTo).get();
        String prefix = "";
        for(int i =0;i<min;i++){
            int finalI = i;
            if(Arrays.stream(strs).allMatch(s -> s.charAt(finalI)==strs[0].charAt(finalI))){
                prefix += strs[0].charAt(i);
            }
            else{
                break;
            }
        }
        return prefix;
    }
}