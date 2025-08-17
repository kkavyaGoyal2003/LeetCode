class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int start = 0, end = 0;
        boolean[][] dp = new boolean[len][len];

        for(int i = 0; i < len; i++) {
            for(int j = i; j >= 0; j--) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(i-j > 1) {
                        dp[i][j] = dp[i-1][j+1];
                    } else {
                        dp[i][j] = true;
                    }
                    if(dp[i][j] == true && end - start < i-j) {
                        end = i;
                        start = j;
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return s.substring(start, end+1);
    }
}