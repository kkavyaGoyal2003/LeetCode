class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        return Math.max(maxLen(answerKey, 'T', k), maxLen(answerKey, 'F', k));
    }

    public int maxLen(String s,char ch, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int len = 0;

        while(j < s.length()) {
            if(s.charAt(j) != ch) count++;

            while(count > k) {
                if(s.charAt(i) != ch) count--;
                i++;
            }

            len = Math.max(len, j-i+1);
            j++;
        }

        return len;
    }
}