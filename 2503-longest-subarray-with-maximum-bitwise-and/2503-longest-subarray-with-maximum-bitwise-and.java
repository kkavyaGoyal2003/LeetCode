class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i : nums) {
            max = Math.max(max, i);
        }

        int len = 1;
        int m = 1;
        for(int i = 1; i < n; i++) {
            if(nums[i] == max && nums[i-1] == nums[i]) {
                len += 1;
                m = Math.max(m, len);
            } else {
                len = 1;
            } 

        }
        return m;
    }
}