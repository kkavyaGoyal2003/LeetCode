class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<len; i++) {
            if(s.charAt(i) == ' ') {
                ans.append(reverseString(str.toString()));
                ans.append(' ');
                str.setLength(0);     
            } else {
                str.append(s.charAt(i));
            }
        }
        ans.append(reverseString(str.toString()));
        return ans.toString();
    }

    public String reverseString(String temp) {
        StringBuilder str = new StringBuilder();

        for(int i = temp.length()-1; i >= 0; i--) {
            str.append(temp.charAt(i));
        }
        return str.toString();
    }
}