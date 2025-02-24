class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0) return 0;
        if(n == 1) return 1;

        int maxLen = 0;
        for(int i = 0; i < n; i++) {
            int hash[] = new int[256];
            for(int j = i; j < n; j++) {
                if(hash[s.charAt(j)] == 1) break;
                maxLen = Math.max(maxLen, j - i +1);
                hash[s.charAt(j)] = 1;
            }
        }
        return maxLen;
    }
}
