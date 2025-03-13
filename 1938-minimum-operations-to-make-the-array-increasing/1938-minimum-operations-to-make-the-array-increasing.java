class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;

        int steps = 0;
        for(int i = 1; i < n; i++) {
            if(nums[i-1] >= nums[i]) {
                steps += nums[i-1] + 1 - nums[i];
                nums[i] = nums[i-1] + 1;
            }
        }

        return steps;
    }
}