class Solution {
    public int characterReplacement(String s, int k) {
        int[] alpha = new int[26];
        int count = 0;
        int i = 0;
        int maxLength = 0;

        for (int j = 0; j < s.length(); j++) {
            alpha[s.charAt(j) - 'A']++;
            count = Math.max(count, alpha[s.charAt(j) - 'A']);

            if ((j-i+1) - count > k) {
                alpha[s.charAt(i) - 'A']--;
                i++;
            }

            maxLength = Math.max(maxLength, j-i+1);
        }

        return maxLength;
    }
}
