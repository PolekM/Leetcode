public class Main {
    public static void main(String[] args) {
       int tab [] = {1,1};
        System.out.println(maxArea(tab));
    }
    public static int maxArea(int[] height) {
        int l=0;
        int r= height.length-1;
        int max = 0;
        int currentArea;
        while(l<r){
            if(height[l]<=height[r]){
                currentArea = height[l]*(r-l);
                l++;
            }
            else {
                currentArea = height[r]*(r-l);
                r--;
            }
            max = Math.max(max,currentArea);
        }

        return max;
    }
}