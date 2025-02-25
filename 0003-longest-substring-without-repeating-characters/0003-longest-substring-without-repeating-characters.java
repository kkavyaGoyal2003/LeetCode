class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0) return 0;
        if(n == 1) return 1;

        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxLen = 0;

        while(j < n) {
            int len = 0;
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(i,map.get(s.charAt(j)) + 1);
            } 
            len = j - i + 1;
            maxLen = Math.max(maxLen, len);
            map.put(s.charAt(j), j);
            j++;
        }
        return maxLen;
    }
}
