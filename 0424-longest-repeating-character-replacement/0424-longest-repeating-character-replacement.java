class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        int maxFreq = 0;

        while(j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));
            int change = (j-i+1) - maxFreq;
            if(change > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                i++;
                j++;
            } else {
                maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }
        }

        return maxLen;
    }
}