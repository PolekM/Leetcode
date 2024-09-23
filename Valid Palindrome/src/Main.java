public class Main {
    public static void main(String[] args) {
        String s = "0a";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        String lowerCase = s.toLowerCase();

        while (l < r) {
            if(Character.isLetterOrDigit(lowerCase.charAt(l)) && Character.isLetterOrDigit(lowerCase.charAt(r))){
                if(lowerCase.charAt(l)!=lowerCase.charAt(r) ){
                    return false;
                }
                l++;
                r--;
            }
            if (!Character.isLetterOrDigit(lowerCase.charAt(l))) {
                l++;
            }
            if (!Character.isLetterOrDigit(lowerCase.charAt(r))) {
                r--;
            }

        }
        return true;
    }
}



