class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int mincost = prices[0];

        for(int i = 1;i<prices.length;i++){
            profit = Math.max(profit,prices[i] - mincost);

            mincost = Math.min(mincost,prices[i]);
        }

        return profit;
    }
}