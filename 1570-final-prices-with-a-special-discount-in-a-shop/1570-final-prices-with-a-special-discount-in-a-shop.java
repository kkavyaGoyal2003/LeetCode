class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] discount =  new int[n];
        Stack<Integer> stk = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            if(stk.isEmpty()) {
                discount[i] = 0;
                stk.push(prices[i]);
            } else if(prices[i] > stk.peek()) {
                discount[i] = stk.peek();
                stk.push(prices[i]);
            } else {
                while(!stk.isEmpty() && prices[i] < stk.peek()) {
                    stk.pop();
                }
                if(stk.isEmpty()) {
                    discount[i] = 0;
                    stk.push(prices[i]);
                } else {
                    discount[i] = stk.peek();
                    stk.push(prices[i]);
                }
            }
        }

        for(int i = 0; i < n; i++) {
            discount[i] = prices[i] - discount[i];
        }

        return discount;
    }
}