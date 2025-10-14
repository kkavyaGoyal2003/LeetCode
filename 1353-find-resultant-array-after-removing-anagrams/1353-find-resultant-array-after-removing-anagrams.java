class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> temp = new ArrayList<>(Arrays.asList(words));

        int i = 1;
        while(i < temp.size())  {
            if(isAnagram(temp.get(i-1), temp.get(i))) {
                temp.remove(i);
            } else {
                i++;
            }
        }

        return temp;
    }
    private boolean isAnagram(String wrd, String wrd2) {
        if(wrd.length() != wrd2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < wrd.length(); i++) {
            char c = wrd.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int i = 0; i < wrd2.length(); i++) {
            char c = wrd2.charAt(i);
            if(!map.containsKey(c)) return false;
            int val = map.get(c);
            map.put(c, val-1);
            if(map.get(c) == 0) map.remove(c);
        }
        if(map.size() == 0) return true;
        return false;
    }
}