class Solution {
    public String replaceDigits(String s) {
        int len = s.length();
        if(len == 1) return s;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < len; i++) {
            if(i % 2 == 0) {
                char c = s.charAt(i);
                str.append(c);
            } else {
                char ch = (char)(s.charAt(i-1) + (s.charAt(i) - '0'));
                str.append(ch);
            }
        }
        return str.toString();
    }
}