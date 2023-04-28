import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        isAnagram("anagram","nagaram");
    }

    public static  boolean isAnagram(String s, String t) {

        char [] characterOfT = t.toCharArray();
        char [] characterOfS = s.toCharArray();

        Arrays.sort(characterOfT);
        Arrays.sort(characterOfS);

        return Arrays.equals(characterOfS,characterOfT);
    }
}
