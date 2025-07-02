class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        
        int i = 0, j = 0;
        while(i < h) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else{
                if(j == 0) {
                    i++;
                } else {
                    j = 0;
                    i = (i-j+1);
                }
            }
            if(j == n) return i-j;
        }

        return -1;
    }
}