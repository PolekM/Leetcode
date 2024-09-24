import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int price [] = {8,4,6,2,3};
        int[] ints = finalPrices(price);
        for (int i :ints) {
            System.out.println(i);

        }
    }
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int len = prices.length;
        int [] newPrice = new int[len];

        for(int i=len-1;i>=0;i--){
            while(!stack.isEmpty() && prices[i]<stack.peek()){
                stack.pop();
            }
            newPrice[i] = stack.isEmpty() ? prices[i] : prices[i] - stack.peek();

            stack.push(prices[i]);
        }
        return newPrice;
    }
}