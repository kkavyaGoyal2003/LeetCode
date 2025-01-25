class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        List<Integer> sol = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        for(int i = 2*n-1; i >= 0; i--){
            if(i < n) {
                if(stk.isEmpty()) {
                    sol.add(-1);
                    stk.push(nums[i]);
                } else if(stk.peek() > nums[i]) {
                    sol.add(stk.peek());
                    stk.push(nums[i]);
                } else {
                    while(!stk.isEmpty() && stk.peek() <= nums[i]) stk.pop();
                    if(stk.isEmpty()) {
                        sol.add(-1);
                    } else {
                        sol.add(stk.peek());
                    }
                    stk.push(nums[i]);
                }
            } else {
                if(stk.isEmpty()) {
                    stk.push(nums[i % n]);
                } else if(stk.peek() > nums[i %n]) {
                    stk.push(nums[i % n]);
                } else {
                    while(!stk.isEmpty() && stk.peek() <= nums[i % n]) stk.pop();
                    stk.push(nums[i % n]);
                }
            }
        }

        int i = 0;
        for(int j = sol.size() - 1 ; j >= 0; j--) {
            nums[i] = sol.get(j);
            i++;
        }

        return nums;
    }
}