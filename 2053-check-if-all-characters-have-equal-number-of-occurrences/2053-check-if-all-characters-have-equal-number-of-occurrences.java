class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int prev = 0;
        for(Map.Entry<Character, Integer> ele : map.entrySet()) {
            if(prev == 0) prev = ele.getValue();
            if(prev != 0 && prev != ele.getValue()) return false;
        }
        
        return true;
    }
}