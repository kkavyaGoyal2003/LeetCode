class Solution {
    public boolean isValid(String s) {
        Stack <Character> stk = new Stack<>();
        int len = s.length();
        if(len % 2 != 0) return false;

        for(int i = 0 ; i < len; i++) {

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            } else {
                if(stk.isEmpty()) return false;
                if(s.charAt(i) == ')'){
                    if(stk.peek() != '(') return false;
                    stk.pop();
                }
                if(s.charAt(i) == '}') {
                    if(stk.peek() != '{') return false;
                    stk.pop();
                } 
                if(s.charAt(i) == ']') {
                    if(stk.peek() != '[') return false;
                    stk.pop();
                }
            }
        }
        if(stk.isEmpty()) return true;
        return false;
    }
}