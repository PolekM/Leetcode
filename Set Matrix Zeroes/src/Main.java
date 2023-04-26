import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int c = matrix.length;
        int r = matrix[0].length;
        Set set = new HashSet();
        for(int i =0;i<c;i++){
            for (int j=0;j<r;j++){
                if(matrix[i][j]==0){
                    set.add(j);
                    for (int k = 0;k<r;k++){
                        if(matrix[i][k] ==0){
                            set.add(k);
                        }
                        matrix[i][k]=0;
                    }
                    break;
                }
            }
        }
        for(int i =0;i<c;i++){
            for (int j=0;j<r;j++){
                if(set.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }

    }

}
