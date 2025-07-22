class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] sol = new int[n];
        Arrays.fill(sol, -1);

        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < 2*n; i++) {
            while(!stk.isEmpty() && nums[stk.peek()] < nums[i%n]) {
                int pop = stk.pop();
                sol[pop] = nums[i%n];
            }
            if(i < n) stk.push(i);
        }

        return sol;
    }
}