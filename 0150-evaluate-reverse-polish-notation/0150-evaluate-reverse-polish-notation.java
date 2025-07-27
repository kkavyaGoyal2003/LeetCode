class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stk = new Stack<>();

        for(String s : tokens) {
            if(s.equals("+")) {
                int top1 = stk.pop();
                int top2 = stk.pop();
                stk.push(top1 + top2);
            } else if(s.equals("-")) {
                int top1 = stk.pop();
                int top2 = stk.pop();
                stk.push(top2 - top1);
            } else if(s.equals("*")) {
                int top1 = stk.pop();
                int top2 = stk.pop();
                stk.push(top1 * top2);
            } else if(s.equals("/")) {
                int top1 = stk.pop();
                int top2 = stk.pop();
                if(top1 < 0  || top2 < 0) {
                    int sol = (int)(top2/ top1);
                    stk.push(sol);
                } else {
                    stk.push(top2 / top1);
                }
            } else{
                stk.push(Integer.parseInt(s));
            }
        }

        return stk.peek();
    }
}