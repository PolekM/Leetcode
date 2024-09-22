import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String digits = "";
        System.out.println(letterCombinations(digits));
    }


    public static List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, String> letters = new HashMap<>();
        letters.put('2',"abc");
        letters.put('3',"def");
        letters.put('4',"ghi");
        letters.put('5',"jkl");
        letters.put('6',"mno");
        letters.put('7',"pqrs");
        letters.put('8',"tuv");
        letters.put('9',"wxyz");
        backtrack(result,stringBuilder,letters,digits,0);
        return result;
    }

    public static void backtrack(List<String> result,StringBuilder stringBuilder,Map<Character,String> letters,String digits, int start){

       if(stringBuilder.length() == digits.length() && digits.length()>0){
           result.add(stringBuilder.toString());
           return;
       }
       for(int i = start;i<digits.length();i++){
           for(int j=0;j<letters.get(digits.charAt(i)).length();j++){
               stringBuilder.append(letters.get(digits.charAt(i)).charAt(j));
               backtrack(result,stringBuilder,letters,digits,i+1);
               stringBuilder.deleteCharAt(stringBuilder.length()-1);
           }

       }
    }
}