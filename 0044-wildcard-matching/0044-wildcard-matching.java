class Solution {
    public boolean isMatch(String s, String p) {
        int lens = s.length();
        int lenp = p.length();
        boolean[][] dp = new boolean[lenp+1][lens+1];
        dp[0][0] = true;

        for(int i = 1; i < lenp+1; i++) {
            if(p.charAt(i-1) == '*') {
                dp[i][0] = dp[i-1][0];
            }
        }

        for(int i = 1; i < lenp+1; i++) {
            for(int j = 1; j< lens+1; j++) {
                if(p.charAt(i-1) == '*'){
                    dp[i][j] = (dp[i][j-1] || dp[i-1][j]);
                } else {
                    if(p.charAt(i-1) == '?' || p.charAt(i-1) == s.charAt(j-1)) {
                        dp[i][j] = dp[i-1][j-1];
                    }
                }
            }
        }
        return dp[lenp][lens];
    }
}