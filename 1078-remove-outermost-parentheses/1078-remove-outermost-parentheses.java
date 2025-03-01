class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        StringBuilder str = new StringBuilder();
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                if(!stk.isEmpty()) str.append(s.charAt(i)); 
                stk.push(s.charAt(i));
            } else {
                stk.pop();
                if(!stk.isEmpty()) str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}