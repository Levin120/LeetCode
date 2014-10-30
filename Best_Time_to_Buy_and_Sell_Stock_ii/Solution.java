public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        int profit = 0;
        int cur = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[cur])
                profit += prices[i] - prices[cur];
            cur = i;
        }
        return profit;
    }
}

