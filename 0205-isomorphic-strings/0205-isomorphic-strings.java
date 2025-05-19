class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < len; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a) && map.get(a) != b) return false;

            map.put(a, b);
        }
        map.clear();
        for(int i = 0; i < len; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(b) && map.get(b) != a) return false;

            map.put(b, a);
        }

        return true;
    }
}