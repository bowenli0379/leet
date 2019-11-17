package Array;

public class BestTimeToBuyAndSellStockII_122 {
    public static int maxProfit(int[] prices){
        int res = 0, profit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1]) {
                profit = prices[i] - prices[i - 1];
                res += profit;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {1,2,3,4,5};
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }
}
