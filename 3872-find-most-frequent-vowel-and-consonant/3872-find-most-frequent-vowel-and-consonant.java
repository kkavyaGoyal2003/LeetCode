class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consot = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel.put(c, vowel.getOrDefault(c, 0) + 1);
            } else {
                consot.put(c, consot.getOrDefault(c, 0) + 1);
            }
        }

        int v = 0;
        int c = 0;
        
        for(Map.Entry<Character, Integer> ele : vowel.entrySet()) {
            int num = ele.getValue();
            v = Math.max(v, num);
        }

        for(Map.Entry<Character, Integer> ele : consot.entrySet()) {
            int num = ele.getValue();
            c = Math.max(c, num);
        }  

        return v+c;     
    }
}