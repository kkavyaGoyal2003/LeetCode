class Solution {
    public int[] dailyTemperatures(int[] temperatures) {//73 74 75 71 69 72 76 73
        int n = temperatures.length; // 8
        int[] days = new int[n]; // 0 0 
        Stack<Integer> stk = new Stack<>();// 7

        for(int i = n - 1; i >= 0; i--) { // 6
            if (!stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i]) {
                while(!stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i]) {
                    stk.pop();
                }
            }
            if (!stk.isEmpty() && temperatures[stk.peek()] > temperatures[i]) {
                days[i] = stk.peek() - i;
                stk.push(i);
            } 
            if(stk.isEmpty()) {
                days[i] = 0;
                stk.push(i);
            } 
        }
        return days;
    }
}