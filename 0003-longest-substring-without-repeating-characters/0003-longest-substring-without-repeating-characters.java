class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len < 2) return len;

        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(int j = 0; j < len; j++) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j))+1, i);
            }
            map.put(s.charAt(j), j);
            max = Math.max(max, j-i+1);
        }

        return max;
    }
}