import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<List<String>> path = new ArrayList<>();
    path.add(List.of("B","C"));
    path.add(List.of("D","B"));
    path.add(List.of("C","A"));
    destCity(path);
    }
    public static String destCity(List<List<String>> paths) {
        String city=paths.get(0).get(1);
        if(paths.size()==1){
            return city;
        }
        for(int i =0; i< paths.size();i++){
            if(paths.get(i).get(0).equals(city)){
                city=paths.get(i).get(1);
                i=0;
            }
        }
        return city;

    }


}
