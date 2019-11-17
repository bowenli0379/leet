package Array;

public class BestTimeToBuyAndSellStock_121 {
    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE, res = 0;
        for (int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            res = Math.max(res, prices[i]-min);
        }
        return res;
    }
    public static void main (String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
