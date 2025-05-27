class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int len = word.length();
        int count = 0;

        for(String s: patterns) {
            int i = 0;
            int ind = -1, j = 0;
            boolean flag = true;
            while(i != s.length() && j != len) {
                if(s.charAt(i) == word.charAt(j)) {
                    if(i == 0) ind = j;
                    i++;
                    j++;
                } else if(i != 0 && s.charAt(i) != word.charAt(j)) {
                    i = 0;
                    j = ind + 1;
                } else {
                    j++;
                }
            }
            if(i == s.length()) count++;

        }

        return count;
    }
}