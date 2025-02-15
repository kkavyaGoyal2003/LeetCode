class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        int i = 1;
        int start = 0;
        int end = n - 1;

        while(i < n - 1) {
            if(nums[i] > nums[start] && nums[i] < nums[end]) {
                count++;
            }
            i++;
        }

        return count;
    }
}