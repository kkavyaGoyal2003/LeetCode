class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k == n) return "0";
        StringBuilder str = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < n; i++) {
            char c = num.charAt(i);
            while (!stk.isEmpty() && stk.peek() > c && k > 0) {
                stk.pop();
                k--;
            }
            stk.push(c);
        }
        if(k > 0) {
            while(k != 0) {
                stk.pop();
                k--;
            }
        }
        while(!stk.isEmpty()) {
            str.append(stk.peek());
            stk.pop();
        }
        str.reverse();
        int len = str.length();
        int i = 0;
        while(i < len && str.charAt(i) == '0') {
            i++;
        }  
        if(i == len) return "0";
        return str.substring(i).toString();
    }
}