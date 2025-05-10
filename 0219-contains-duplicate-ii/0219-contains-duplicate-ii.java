class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int i = 0;

        while(i < n -1) {
            int j = i + 1;
            while(j <= k+i && j < n) {
                if(nums[i] == nums[j]) return true;
                j++;
            }
            i++;
        }

        return false;
    }
}