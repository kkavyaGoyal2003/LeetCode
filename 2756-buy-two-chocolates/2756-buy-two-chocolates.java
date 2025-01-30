class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int costChoco = prices[0] + prices[1];

        if(costChoco <= money) {
            return money - costChoco;
        }

        return money;
    }
}