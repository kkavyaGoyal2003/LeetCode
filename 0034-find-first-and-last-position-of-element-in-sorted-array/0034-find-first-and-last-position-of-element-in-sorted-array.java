class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n == 0) return new int[] {-1, -1};

        int first = -1;
        int last = -1;

        int low = 0;
        int high = n - 1;
        while(low <= high) {
            int mid = (high - low) / 2 + low;

            if(nums[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if(target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if(first != -1) low = first;
        else low = 0;
        high = n - 1;
        while(low <= high) {
            int mid = (high - low) / 2 + low;

            if(nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if(target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


        return new int[] {first, last};
    }
}