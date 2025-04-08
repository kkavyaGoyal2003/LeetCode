class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        while(true) {
            int len = nums.length;
            if(checkDistinct(nums)) return count;

            int n = Math.min(3, len);
            nums = java.util.Arrays.copyOfRange(nums, n, len);
            count++;
        }
    }
    public boolean checkDistinct(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums) {
            if(set.contains(i)) return false;
            set.add(i);
        }
        return true;
    }
}