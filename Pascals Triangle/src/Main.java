import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

       for(int i =0;i<numRows;i++){
           List insideList = new ArrayList();
           for (int j=0; j<=i;j++){
               if(j==0){
                   insideList.add(1);
               } else if (j==i) {
                   insideList.add(1);
               }else {
                  insideList.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
               }
           }
           list.add(insideList);
       }

        return list;
    }

}
