class Solution {
    public int calculate(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int curr = 0;
        int calc = 0;
        int tail = curr;
        char sign = '+';
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                curr = (curr*10) + c - '0';
            }
            if((!Character.isDigit(c) && c != ' ') || i == s.length() -1) {
                if(sign == '+') {
                    calc += curr;
                    tail = curr;
                } else if(sign == '-') {
                    calc -= curr;
                    tail = -curr;
                } else if(sign == '*') {
                    calc = (calc - tail + tail * curr);
                    tail = tail*curr;
                } else {
                    calc = (calc - tail + tail / curr);
                    tail = tail/curr;
                }
                curr = 0;
                sign = c;
            }        
        }
        return calc;
    }
}