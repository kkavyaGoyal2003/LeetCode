class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        Stack<Integer> stk = new Stack<>();
        int max = 0;

        for(int i = 0; i < n; i++) {
            if(stk.isEmpty()) {
                stk.push(prices[i]);
            } else if(stk.peek() < prices[i]) {
                max += (prices[i] - stk.pop());
                stk.push(prices[i]);
            } else {
                stk.pop();
                stk.push(prices[i]);

            }
        }

        return max;
    }
}