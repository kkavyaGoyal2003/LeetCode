class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int m = amount;

        int[][] dp = new int[n+1][m+1];
        dp[0][0] = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= m; j++) {
                if(j < coins[i-1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j]  + dp[i][j- coins[i-1]];
                }
            }
        }

        return dp[n][m];
    }

    // public int findWays(int[] coins, int amount, int index) {
    //     if(aount == 0) return  1;

    //     if(amount < 0 || index = coins.length) return 0;

    //     int case1 = findWays(coins, amount , index +1);
    //     int case2 = findWays(coins, amount - coins[index], index);

    //     return case1 + case2;
    // }
}