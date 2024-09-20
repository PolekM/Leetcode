import java.util.*;

public class Main {
    public static void main(String[] args) {
       int [] tab = {2,3,5};
       int target = 8;

        System.out.println(combinationSum(tab,target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> uniqueCombination = new LinkedList<>();
        backtrack(result,uniqueCombination,candidates,target,0,0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> uniqueCombination,int [] candidates, int target,int sum,int start) {
        System.out.println(uniqueCombination);
        if(sum == target){
                result.add(new LinkedList<>(uniqueCombination));
            return;
        }
        if(sum>target){
            return;
        }

        for(int i=start;i<candidates.length;i++){
            sum = sum + candidates[i];
            uniqueCombination.add(candidates[i]);
            backtrack(result,uniqueCombination,candidates,target,sum,i);
            sum = sum -candidates[i];
            uniqueCombination.remove(uniqueCombination.size()-1);
        }
    }



}