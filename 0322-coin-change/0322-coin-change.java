class Solution {

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int m = amount;
        int[][] dp = new int[n+1][m+1];

        for(int i = 1; i < m + 1; i++) {
            dp[0][i] = Integer.MAX_VALUE - 20;
        } 
        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < m + 1; j++) {
                if(j < coins[i-1]) {
                    dp[i][j] = dp[i-1][j];
                } else{
                    dp[i][j] = Math.min(dp[i-1][j], 1+dp[i][j - coins[i-1]]);
                }
            }
        }
        int sol = dp[n][m];
        if(sol >= Integer.MAX_VALUE - 20) return -1;
        return sol;
    }

}