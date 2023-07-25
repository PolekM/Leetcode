import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("MDCXCV"));

    }

    public static int romanToInt(String s) {

        Map<String,Integer> map = new HashMap<>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);

        int  result = 0;
        int length = s.length();
        for(int i=0;i<length;i++){
            if(i<length-1 && map.get(s.charAt(i)+"")<map.get(s.charAt(i+1)+"")) result -= map.get(s.charAt(i)+"");
            else result +=map.get(s.charAt(i)+"");
        }

        return result;
    }

}
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000