class Solution {
    public String customSortString(String order, String s) {
        HashMap<Integer, Character> mapO = new HashMap<>();
        HashMap<Character, Integer> mapS = new HashMap<>();

        for(int i = 0; i < order.length(); i++) {
            mapO.put(i, order.charAt(i));
        }

        for(char c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < order.length(); i++) {
            char c = mapO.get(i);
            if(mapS.containsKey(c)) {
                for(int j = 0 ; j < mapS.get(c); j++) {
                    ans.append(c);
                }
                mapS.remove(c);
            }
        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(mapS.containsKey(c)) {
                ans.append(c);
                mapS.put(c, mapS.get(c) - 1);
                if(mapS.get(c) == 0) mapS.remove(c);
            }
        }
        return ans.toString();
    }
}