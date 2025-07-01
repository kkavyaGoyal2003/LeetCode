class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            if(map.containsKey(c)) {
                for(int j = 0 ; j < map.get(c); j++) {
                    ans.append(c);
                }
                map.remove(c);
            }
        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                for(int j = 0 ; j < map.get(c); j++) {
                    ans.append(c);
                }
                map.remove(c);
            }
        }
        return ans.toString();
    }
}