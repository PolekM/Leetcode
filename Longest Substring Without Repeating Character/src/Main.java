import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len<=1){
            return len;
        }
        int r = 1;
        int max =0;
        Deque<Character> deque = new LinkedList<>();
        deque.add(s.charAt(0));
        while(r<len){
            char tempChar = s.charAt(r);
            if(deque.contains(tempChar)){
                deque.removeFirst();

            }else {
                deque.add(tempChar);
                max = Math.max(max,deque.size());
                r++;
            }

        }
        return max;
    }

}