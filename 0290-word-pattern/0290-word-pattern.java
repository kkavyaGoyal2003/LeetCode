class Solution {
    public boolean wordPattern(String pattern, String s) {
        int len = pattern.length();
        String [] str = s.split(" ");
        
        if(len != str.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> word = new HashSet<>();

        for(int i = 0; i < len; i++) {
            char p = pattern.charAt(i);
            String st = str[i];
        
            if(map.containsKey(p) ){
                if(!map.get(p).equals(st)) return false;  
            } else {
                if(word.contains(st)) return false;
                map.put(p, st);
                word.add(st);
            }
        }

        return true;
    }
}