class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        return (maxNum(nums2) - maxNum(nums1));
    }
    public int maxNum(int[] num) {
        int max = -1;
        for(int i : num) {
            max = Math.max(max, i);
        }
        return max;
    }
}