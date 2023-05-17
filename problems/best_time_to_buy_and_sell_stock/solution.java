class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int minProfit = 0; 
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            minProfit = prices[i] - min;
            if(maxProfit < minProfit) {
                maxProfit = minProfit;
            }
        }
        return maxProfit;
    }
}