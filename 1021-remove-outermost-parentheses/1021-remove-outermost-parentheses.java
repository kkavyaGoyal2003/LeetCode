class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        Stack<Character> stk = new Stack<>();
        StringBuilder str = new StringBuilder(); 

        for(char c: s.toCharArray()) {
            
            if(c == '(') {
                if(!stk.isEmpty()) str.append(c);
                stk.push(c);
            } else {
                stk.pop();
                if(!stk.isEmpty()) str.append(c);
            }
        }
       
        return str.toString();
    }
}