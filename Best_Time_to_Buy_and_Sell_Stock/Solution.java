public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, begin = 0, end = 0, delta = 0;
        for(int i=0; i < prices.length; i++) {
            end = i;
            delta = prices[end] - prices[begin];
            if (delta <= 0){
                begin = i;
            }
            if ( delta > max ){
                max = delta;
            }
        }
        return max;
    }
}

