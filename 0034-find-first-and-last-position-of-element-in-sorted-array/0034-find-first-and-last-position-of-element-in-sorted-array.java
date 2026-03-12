class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n == 0) return new int[]{-1,-1};

        int first = firstPos(nums, target);
        int last = lastPos(nums, target);

        return new int[]{first, last};
    }
    private int firstPos(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        int ind = -1;
        while(low <= high) {
            int mid = low+(high-low)/2;
            if(nums[mid] == target) {
                if(ind == -1) ind = mid;
                else ind = Math.min(ind, mid);
            }
            if(nums[mid] >= target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ind;
    }
    private int lastPos(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        int ind = -1;
        while(low <= high) {
            int mid = low+(high-low)/2;
            if(nums[mid] == target) {
                if(ind == -1) ind = mid;
                else ind = Math.max(ind, mid);
            }
            if(nums[mid] <= target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ind;
    }
}