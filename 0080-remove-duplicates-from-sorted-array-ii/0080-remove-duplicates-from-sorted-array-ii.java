class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 1;
        int j = 1;
        int count = 1;
        int k = 2;

        while(j < n) {
            if(nums[j-1] == nums[j]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= k) {
                nums[i] = nums[j];
                i++;
            } 
            j++;
        }

        return i;
    }
}