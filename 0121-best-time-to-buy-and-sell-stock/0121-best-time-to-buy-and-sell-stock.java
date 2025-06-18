class Solution {
    public int maxProfit(int[] prices) {
        sellStock(prices, 0, Integer.MAX_VALUE);
        return max;
    }
    int max = 0;
    private void sellStock(int[] prices, int ind, int buy) {
        if(ind == prices.length) return;
 
        if(prices[ind] < buy) {
            buy = prices[ind];
        } else {
            max = Math.max(max, prices[ind] - buy);
        }
        sellStock(prices, ind+1, buy);
    }
    
}