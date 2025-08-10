class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        if(nums[0] == 0) return false;
        HashSet<Integer> dp = new HashSet<>();
        return dfs(nums, 0, dp);
        
    }
    private boolean dfs(int[] nums, int curr, HashSet<Integer> dp) {
        if(curr == nums.length -1 ) return true ;
        if(dp.contains(curr)) return false;

        for(int i = 1; i <= nums[curr]; i++) {

            if(dfs(nums, curr+i, dp)) return true;
        }
        dp.add(curr);
        return false;
    }
}