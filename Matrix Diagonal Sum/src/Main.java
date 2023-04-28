public class Main {

    public static void main(String[] args) {
        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        diagonalSum(nums);
    }

    public static int diagonalSum(int[][] mat) {
        int sum =0;
        int left =0;
        int right = mat.length-1;
        for(;right>=0;left++,right--){
            if(left!=right)
                sum+=mat[left][left]+mat[left][right];
            else
                sum+=mat[left][right];
        }
        return sum;
    }
}
