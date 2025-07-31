class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        // int max = 0;
        // for(int i : nums) {
        //     max = Math.max(max, i);
        // }

        int len = 1;
        int m = 1;
        int max = nums[0];
        for(int i = 1; i < n; i++) {
            if(max < nums[i]) {
                max = nums[i];
                len = 1;
                m = 1;
            }
            if(nums[i] == max && nums[i-1] == nums[i]) {
                len += 1;
                m = Math.max(m, len);
            } else if(max > nums[i]){
                len = 1;
            } 

        }
        return m;
    }
}