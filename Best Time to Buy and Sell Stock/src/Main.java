public class Main {
    public static void main(String[] args) {
        int [] price = {7,1,5,3,6,4};
        maxProfit(price);
    }

    public static int maxProfit(int[] prices) {
        int minValue = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minValue >= prices[i]) {
                minValue = prices[i];
            }
            if (profit < prices[i] - minValue)
                profit = prices[i] - minValue;

        }

        return profit > 0 ? profit : 0;
    }
}
