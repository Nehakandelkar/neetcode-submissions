class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int maxProfit = 0;

        int sell = n-1;
        int buy = n-2;

        while(buy >= 0){
            int profit = 0;
            if(prices[buy] > prices[sell]){
                sell = buy;
                buy--;
            }
            else{
                profit = prices[sell] - prices[buy];
                buy--;
            }

            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;       
    }
}
