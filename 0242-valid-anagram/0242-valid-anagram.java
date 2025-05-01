class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                int i = map.get(c);
                map.put(c, i -1);
                if(map.get(c) == 0) map.remove(c);
            }
        }

        if(map.size() == 0) return true;

        return false;
    }
}