class Solution {
    public int findPermutationDifference(String s, String t) {
        int len = s.length();
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for(int i  = 0; i < len; i++){
            smap.put(s.charAt(i), i);
        }

        for(int i  = 0; i < len; i++){
            tmap.put(t.charAt(i), i);
        }

        int sum = 0;
        for(int i  = 0; i < len; i++) {
            sum += Math.abs(smap.get(s.charAt(i)) - tmap.get(s.charAt(i)));
        }

        return sum;
    }
}