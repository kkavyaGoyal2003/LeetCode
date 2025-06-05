class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);

        return Math.min(reachTop(cost, 0, dp), reachTop(cost, 1, dp));
        
    }

    public int reachTop(int[] cost, int ind, int [] dp) {
        if(ind >= cost.length) return 0;

        if(dp[ind] != -1) return dp[ind];

        int stepOne = cost[ind] + reachTop(cost, ind+1, dp);
        int stepTwo = cost[ind] + reachTop(cost, ind+2, dp);
        dp[ind] = Math.min(stepOne, stepTwo);

        return dp[ind];
    }
}