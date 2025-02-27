class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int countSmall = 0;
        int countEqual = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        while(r < n) {
            sum += (nums[r]%2);
            while(sum > k) {
                sum -= (nums[l]%2);
                l++;
            }
            countEqual += (r - l + 1);
            r++;
        }
        l = 0;
        r = 0;
        sum = 0;
        while(r < n) {
            sum += (nums[r]%2);
            while(sum > k - 1) {
                sum -= (nums[l]%2);
                l++;
            }
            countSmall += (r - l + 1);
            r++;
        }
        return countEqual - countSmall;
    }
}