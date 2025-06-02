class Solution {
    public int calPoints(String[] operations) {        
        Stack<Integer> stk = new Stack<>();

        for(String s : operations) {
            if(s.equals("C")) {
                if(!stk.isEmpty()) stk.pop();
            } else if(s.equals("D")) {
                stk.push(2*stk.peek());
            } else if(s.equals("+")) {
                int top1 = stk.pop();
                int top2 = stk.pop();
                stk.push(top2);
                stk.push(top1);
                stk.push(top2 + top1);
            } else {
                stk.push(Integer.parseInt(s));
            }
        }

        int total = 0;
        while(!stk.isEmpty()) {
            total += stk.pop();
        }
        return total;
    }
}