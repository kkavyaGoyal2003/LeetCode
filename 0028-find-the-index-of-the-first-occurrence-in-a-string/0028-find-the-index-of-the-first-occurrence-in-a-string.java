class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        int i = 0;
        int j = 0;

        while(i < hlen) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if(j == nlen) return i - j;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return -1;
    }
}