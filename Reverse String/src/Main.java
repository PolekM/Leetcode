public class Main {

    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        char left;
        char right;
        int len = s.length-1;
        for(int i=0,j=len;i<len;i++,j--){
            if(i>=j){
                break;
            }
            left = s[i];
            right = s[j];
            s[i]= right;
            s[j]= left;

        }
    }
}
