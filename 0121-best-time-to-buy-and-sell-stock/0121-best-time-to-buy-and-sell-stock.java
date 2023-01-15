class Solution {
    public int maxProfit(int[] prices) {
        int last = -1;
        int profit = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            int priceNow = prices[i];
            if (priceNow > last) {
                last = priceNow;
            }

            if (priceNow < last) {
                int t = last - priceNow;
                if (t > profit) 
                    profit = t;
            }
            
        }

        return profit;
    }
}