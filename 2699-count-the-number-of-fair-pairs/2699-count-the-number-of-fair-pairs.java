class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        if(n == 1) return 0;
        Arrays.sort(nums);
        long count = 0;

        for(int i = 0; i < n - 1; i++) {
            int low = i + 1;
            int high = n - 1;
            while(low <= high) {
                int mid = low + ((high - low)/ 2);
                long sum = (long)(nums[i] + nums[mid]);
                if(sum < lower) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            int min = low;
            
            low = i + 1;
            high = n - 1;
            while(low <= high) {
                int mid = low + ((high - low)/ 2);
                long sum = (long)(nums[i] + nums[mid]);
                if(sum > upper) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            int max = high;
            count += max - min + 1;

        }
        return count;
    }
}