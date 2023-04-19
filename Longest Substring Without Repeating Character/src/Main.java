public class Main {

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }

    public static int lengthOfLongestSubstring(String s) {
        String s1;
        int longest = 0;
        for (int j = 0; j < s.length(); j++) {
            s1 = "";
            for (int i = j; i < s.length(); i++) {
                if (!s1.contains(s.charAt(i) + "")) {
                    s1 += s.charAt(i);
                } else {
                    break;
                }
            }
            if (s1.length() > longest) {
                longest = s1.length();
            }
        }
        return longest;
    }

}