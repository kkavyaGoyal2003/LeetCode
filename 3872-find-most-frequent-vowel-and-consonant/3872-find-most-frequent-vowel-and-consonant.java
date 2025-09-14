class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consot = new HashMap<>();

        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel.put(c, vowel.getOrDefault(c, 0) + 1);
                max1 = Math.max(max1, vowel.get(c));
            } else {
                consot.put(c, consot.getOrDefault(c, 0) + 1);
                max2 = Math.max(max2, consot.get(c));
            }
        }
        return max1+max2;    
    }
}