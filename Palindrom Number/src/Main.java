import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1212));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(121121));
        System.out.println(isPalindrome(333331));
    }

    public static boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        List<Integer> list =new ArrayList<>();
        while(x>0){
           list.add(x%10);
            x=x/10;
        }

        for(int i=0,j=list.size()-1;i<=j;i++,j--){
            if(!list.get(i).equals(list.get(j))){
                return false;
            }
        }

        return true;
    }
}