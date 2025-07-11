package Arrays;
public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
       int minPrice=Integer.MAX_VALUE;
       int maxProfit=0;
       for(int price:prices){
        if(price<minPrice){
            minPrice=price;
        }else{
            int profit=price-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
       }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        System.out.println("Maximum Profit of this week :"+maxProfit(prices));

    }
}
