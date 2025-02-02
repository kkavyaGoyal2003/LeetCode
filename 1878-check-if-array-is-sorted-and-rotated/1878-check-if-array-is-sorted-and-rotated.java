class Solution {
    public boolean check(int[] nums) {
        int n  = nums.length;

        int index = -1;
        for(int i = 0 ; i < n-1; i++) {
            if(nums[i+1] - nums[i] < 0) {
                index = i+1;
                break;
            }
        }

        if(index == -1) return true;

        for(int i = index; i < n - 1; i++) {
            if(nums[i+1] - nums[i] < 0) {
                return false;
            }
        }
        if(nums[n-1] > nums[0]) return false;

        return true;
    }
}
