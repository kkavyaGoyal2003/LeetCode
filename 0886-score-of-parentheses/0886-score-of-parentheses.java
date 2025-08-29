class Solution {
    public int scoreOfParentheses(String s) {
        int len = s.length();
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stk.push(-1);
            } else {
                int score = 0;
                while(stk.peek() != -1) {
                    score += stk.pop();
                }
                stk.pop();
                if(score == 0) {
                    stk.push(1);
                } else {
                    stk.push(2*score);
                }
            }
        }

        int res = 0;
        while(!stk.isEmpty()) {
            res += stk.pop();
        }

        return res;
    }
}