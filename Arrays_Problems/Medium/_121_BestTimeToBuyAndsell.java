package Arrays_Problems.Medium;

public class _121_BestTimeToBuyAndsell {
    public static int stockbuySell(int[] prices){
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = 1; j < prices.length; j++) {
                int profit=prices[j]-prices[i];
                maxProfit=Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
         int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + stockbuySell(prices));
    }
}
