class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        int i = 0, j = 0, k = 0;
        StringBuilder str =  new StringBuilder();

        while(i < n1 && j < n2) {
            if(k % 2 == 0) {
                str.append(word1.charAt(i));
                i++;
            } else {
                str.append(word2.charAt(j));
                j++; 
            }
            k++;
        }

        while(i < n1) {
            str.append(word1.charAt(i));
            i++; 
        }

        while(j < n2) {
            str.append(word2.charAt(j));
            j++; 
        }

        return str.toString();
    }
}