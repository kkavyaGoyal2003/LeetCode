class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int low = 0;
        int high = n-1;
        while(low <= high) {
            if(nums[low] <= nums[high]) return nums[low];
            int mid = (high - low) / 2 + low;

            if(mid != 0 &&  nums[mid] < nums[mid - 1])  return nums[mid];
            if(mid != n - 1 && nums[mid] > nums[mid + 1]) return nums[mid + 1];

            if(nums[low] <=  nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
}