// O(n) Solution
class Solution {
    public int maxProfit(int[] prices) {
        int profit_max = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i -1]){
                profit_max += prices[i] - prices[i - 1];
            }
        }
        return profit_max;
    }
}
