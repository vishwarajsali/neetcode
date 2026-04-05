class Solution {
    public int maxProfit(int[] prices) {
           int maxProfit = 0, buy = 0, sell = 1, n = prices.length;
        while( sell < n){
            if(prices[buy] < prices[sell]){
                int profit = prices[sell] - prices[buy]; 
                maxProfit = Math.max(maxProfit, profit);
            }else buy = sell;
            
            sell++;
        }

        return maxProfit;
    }
}
