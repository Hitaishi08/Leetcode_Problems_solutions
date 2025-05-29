class Solution {
    public int maxProfit(int[] n) {
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;

        int buyday = 0,sellday = 0;

        int maxprice = 0;

        for(int i =0;i<n.length;i++)
        {
            if(buy > n[i])
            {
                buy = n[i];
                buyday = i;
            }

            if(sell < n[i] && buyday < i)
            {
                sell = n[i];
                sellday = i;
            }

            if(sellday > 0 && buyday > -1)
            {
                int price = sell - buy;
                if(price > maxprice)
                {
                    maxprice = price;
                }
                sell = 0;
                System.out.print(price + " ");
            }
        }
        return maxprice;
    }
}