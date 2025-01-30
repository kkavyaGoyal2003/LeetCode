class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int i = 0; 
        int j = 0;
        long prd = 1;
        int count = 0;

        while(j < n) {
            prd = prd * nums[j];
            if(prd < k) {
                count += j - i + 1;
                j++;
            } else {
                while(prd >= k && i <= j) {
                    prd = prd / nums[i];
                    i++;
                }
                count += j - i + 1;
                j++;
            }
        }

        return count;
    }
}