class Solution {
    public boolean isMatch(String s, String p) {
        int lens = s.length();
        int lenp = p.length();
        boolean[] dp = new boolean[lenp+1];
        dp[0] = true;

        for(int i = 1; i < lenp+1; i++) {
            if(p.charAt(i-1) == '*') dp[i] = dp[i-1];
        }

        for(int i = 1; i < lens+1; i++) {
            boolean digUp = dp[0];
            dp[0] = false;
            for(int j = 1; j< lenp+1; j++) {
                boolean temp = dp[j];
                if(p.charAt(j-1) == '*'){
                    dp[j] = dp[j-1] || dp[j];
                } else {
                    if(p.charAt(j-1) == '?' || p.charAt(j-1) == s.charAt(i-1)) {
                        dp[j] = digUp;
                    } else {
                        dp[j] = false;
                    }
                }
                digUp = temp;
            }  
        }
        return dp[lenp];
    }
}