class Solution {
    public int minSteps(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for(int i = 0; i < sLen; i++) {
            char ch = s.charAt(i);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < tLen; i++) {
            char ch = t.charAt(i);
            tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        for(Map.Entry<Character, Integer> ele : smap.entrySet()) {
            int sFreq = ele.getValue();
            int tFreq = tmap.getOrDefault(ele.getKey(), 0);

            if(tFreq < sFreq) count += sFreq - tFreq;
        }

        return count;
    }
}