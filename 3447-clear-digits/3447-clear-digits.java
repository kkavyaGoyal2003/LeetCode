class Solution {
    public String clearDigits(String s) {
        int len = s.length();
        Stack<Character> stk = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(ch >= 48 && ch <= 57 && !stk.isEmpty()) {
                char c = stk.pop();
            } else {
                stk.push(ch);
            }
        }
        while(!stk.isEmpty()) {
            char c = stk.pop();
            str.append(c);
        }
        return str.reverse().toString();
    }
}