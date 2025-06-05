class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len < 2) return len;

        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        while(i < len && j < len) {
            if(set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(s.charAt(j));
                max = Math.max(max, j-i+1);
                j++;
            }
        }

        return max;
    }
}