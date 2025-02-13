class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(i+k-1 == n) break;
            min = Math.min(min, nums[i+k-1] - nums[i]);
        }

        return min;
    }
}