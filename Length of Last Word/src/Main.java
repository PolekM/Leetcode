public class Main {

    public static void main(String[] args) {
     lengthOfLastWord("luffy is still joyboy");
    }

    public static int lengthOfLastWord(String s) {
        int lenghtOfSentence = s.length()-1;
        int count =0;

        for(int i =lenghtOfSentence;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
                if( i-1<0 || s.charAt(i-1)==' '){
                    return count;
                }
            }


        }
        return count;
    }
}
