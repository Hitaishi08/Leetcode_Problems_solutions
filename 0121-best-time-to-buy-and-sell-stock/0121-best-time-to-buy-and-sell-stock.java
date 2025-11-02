class Solution {
    public int maxProfit(int[] prices) {
        // we dont need to keep track of sell and buy explicitly 
        // because each day work as selling day

        int buy = Integer.MAX_VALUE,maxprofit = 0;

        for(int i = 0;i<prices.length;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else if(prices[i] - buy > maxprofit){
                maxprofit = prices[i] - buy;
            }
        }

        return maxprofit;
    }
}