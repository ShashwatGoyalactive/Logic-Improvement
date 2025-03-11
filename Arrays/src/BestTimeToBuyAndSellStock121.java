import java.util.*;
public class BestTimeToBuyAndSellStock121 {
//    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1568639187/
class Solution {
    public int maxProfit(int[] prices) {
        int n=0;
        return maxProfit(prices, 1, prices[0]);
    }
    int profit =0;
    public int maxProfit(int[] prices , int i , int buy){
        if(i==prices.length) return profit;
        if(prices[i] < buy){
            return maxProfit(prices , i+1 , prices[i]);
        }
        profit = Math.max(profit , prices[i] - buy);
        return maxProfit(prices, i+1, buy);

    }
}
}
