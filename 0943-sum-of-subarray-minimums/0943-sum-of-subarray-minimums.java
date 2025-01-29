class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long sum = 0;
        Stack<Integer> stk = new Stack<>();
        int[] prev = new int[n];
        int[] next = new int[n];

        for(int i = 0 ; i < n; i++) {
            if(stk.isEmpty()) {
                prev[i] = -1;
            } else {
                while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
                    stk.pop();
                } 
                if(stk.isEmpty()) {
                    prev[i] = -1;
                } else {
                    prev[i] = stk.peek();  
                }
            }
            stk.push(i);
        }
        stk.clear();
        for(int i = n - 1 ; i >= 0; i--) {
            if(stk.isEmpty()) {
                next[i] = n;
            } else {
                while(!stk.isEmpty() && arr[stk.peek()] > arr[i]) {
                    stk.pop();
                } 
                if(stk.isEmpty()) {
                    next[i] = n;
                } else {
                    next[i] = stk.peek();  
                }
            }
            stk.push(i);
        }
        
        for(int i = 0; i < n; i++) {
            long p = i - prev[i];
            long j = next[i] - i;
            sum = (sum + p * j * arr[i]) % 1000000007;
        }

        return (int)sum;
    }
}