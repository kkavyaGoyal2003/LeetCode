class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long max = (long)(nums[n-1] * nums[n-2]) - (long)(nums[0] * nums[1]);

        return (int)(max);
    }
}