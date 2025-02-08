class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        if(n  == 1) return -1;

        Arrays.sort(nums);
        if(nums[0] > 0) return -1;

        int i = 0; 
        int j = n - 1;

        while(i < j) {
            if(nums[i] < 0 && Math.abs(nums[i]) == nums[j]) return nums[j];

            if(Math.abs(nums[i]) >= nums[j]) {
                i++;
            } else {
                j--;
            }
        }

        return -1;
    }
}