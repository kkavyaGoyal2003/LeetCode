class Solution {
    public int longestPalindrome(String s) {
        int len = s.length();
        if(len == 1) return 1;
        
        HashMap<Character, Integer> map =  new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int total = 0;
        boolean  odd = false;
        for(Map.Entry<Character, Integer> ele : map.entrySet()) {
            int val = ele.getValue();
            if(val % 2 == 0) {
                total += val;
            } else {
                total += val - 1;
                odd = true;                
            }
        }

        return odd ? total+1 : total;
    }
}