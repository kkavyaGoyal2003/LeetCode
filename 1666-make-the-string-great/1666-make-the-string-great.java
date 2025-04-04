class Solution {
    public String makeGood(String s) {
        int len = s.length();
        Stack<Character> stk = new Stack<>();
        
        for(char ch : s.toCharArray()) {
            if(!stk.isEmpty() && Math.abs(stk.peek() - ch) == 32) {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }

        StringBuilder str = new StringBuilder();
        while(!stk.isEmpty()) {
            str.append(stk.pop());
        }

        return str.reverse().toString();
    }
}