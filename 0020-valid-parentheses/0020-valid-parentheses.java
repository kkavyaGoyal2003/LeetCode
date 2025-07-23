class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i <len; i++) {
            char c = s.charAt(i);
            if(c == ')') {
                if(stk.isEmpty() || stk.peek() != '(') return false;
                stk.pop();
            } else if(c == ']') {
                if(stk.isEmpty() || stk.peek() != '[') return false;
                stk.pop();
            } else if(c == '}') {
                if(stk.isEmpty() || stk.peek() != '{') return false;
                stk.pop();
            } else {
                stk.push(c);
            }
        }

        return stk.isEmpty();
    }
}