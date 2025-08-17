class Solution {
    int start = 0;
    int end = 0;
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len == 1) return s;
        int max = 0;
        String sb = "";

        for(int i =  0 ; i < len; i++) {
            findPaindrome(s, i, i);
            if(i != len-1 && s.charAt(i) == s.charAt(i+1)) {
                findPaindrome(s, i, i+1);
            }
        }

        return s.substring(start, end+1);
    }
    private  void findPaindrome(String s, int st, int e) {
        while(st >= 0 && e < s.length()  && s.charAt(st) == s.charAt(e)) {
            st--;
            e++;
        }
        st++;
        e--;
        if(e - st > end - start) {
            start = st;
            end = e;
        }
    }
}