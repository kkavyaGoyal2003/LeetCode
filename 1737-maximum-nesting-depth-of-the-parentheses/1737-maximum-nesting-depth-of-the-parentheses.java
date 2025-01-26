class Solution {
    public int maxDepth(String s) {
        if(s.length() == 1) return 0;
        Stack<Character> stk = new Stack<>();

        int len = s.length();
        int count = 0;
        int max = 0;

        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(c == '(' || c == ')') {
                stk.push(c);
            } 
        }

        while(!stk.isEmpty()) {
            if(stk.peek() == ')') {
                stk.pop();
                count++;
            } else if(stk.peek() == '(') {
                max = Math.max(max, count);
                stk.pop();
                count--;
            }
        }
        return max;
    }
}