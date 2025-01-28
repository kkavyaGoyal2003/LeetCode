class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int low = 0; 
        int high = n;

        while(low <= high) {
            int mid = low + ((high - low) / 2);
            int count = 0;

            for(int i = 0; i < n; i++) {
                if(nums[i] >= mid) count++;
            }
            
            if(count == mid) return mid;
            if(count > mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }

        return -1;
    }
}