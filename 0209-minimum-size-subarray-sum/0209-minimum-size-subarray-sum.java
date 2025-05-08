class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        int sum  = 0;

        while(j < n || sum >= target) { 
            if(sum < target  && j < n) { 
                sum += nums[j]; 
                j++;  
            } else {
                if(sum >= target) min = Math.min(min, j - i);
                sum -= nums[i];
                i++;
            }
        }

        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}