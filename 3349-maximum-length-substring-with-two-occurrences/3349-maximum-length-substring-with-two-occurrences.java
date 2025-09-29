class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int max = 0;
        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int j = 0; j < n; j++) {
            char c = s.charAt(j);
            if(!map.containsKey(c)) map.put(c, 0);
            map.put(c, map.get(c)+1);
            while(i < n && map.get(c) > 2) {
                char temp = s.charAt(i);
                if(map.containsKey(temp)) {
                    map.put(temp, map.get(temp) - 1);
                }
                i++;
            }
            int len = j - i + 1;
            max = Math.max(max, len);
        }

        return max;
    }
}