class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();

        char ch = 'a';
        for(int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if(c == ' ' || map.containsKey(c)) continue;

            map.put(c, ch);
            ch++;
            
        }

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if(c == ' ') {
                ans.append(c);
            } else {
                ans.append(map.get(c));
            }
        }

        return ans.toString();
    }
}