class Solution {
    public String truncateSentence(String s, int k) {
        String [] word1 = s.split(" ");
        String [] word2 = new String [k];

        for(int i = 0; i < k; i++) {
            word2[i] = word1[i];
        }
        
        String str = String.join(" ", word2);
        return str;
    }
}