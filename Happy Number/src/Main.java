import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(19));

    }
    public static boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        HashMap<Integer,Integer> hashMap = new HashMap();
        hashMap.put(n,1);
        while(n!=1){
            n = sumOfDigits(n);

            if(hashMap.containsKey(n)){
                return false;
            }
            hashMap.put(n,1);
        }
        return true;
    }

    private static int sumOfDigits(int n) {
        int sum =0;
        while(n>0){
            sum = sum + (int)Math.pow(n%10,2);
            n = (n- n%10)/10;
        }
        return sum;
    }
}