class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if(len == k) return "0";
        Stack<Character> stk = new Stack<>();

        int n = k;
        for(int i = 0; i < len;  i++) {
            char c = num.charAt(i);
            while(!stk.isEmpty() && n > 0 && stk.peek() - '0' > c -'0') {
                stk.pop();
                n--;
            }
            
            stk.push(c);
        } 


        StringBuilder str = new StringBuilder();
        while(!stk.isEmpty()) {
            str.append(stk.pop());
        }
        str.reverse();
        while(n != 0) {
            str.deleteCharAt(str.length()-1);
            n--;
        }
        while(true) {
            if(str.length() == 0 )  return "0";
            if(str.charAt(0) != '0') break;
            str.deleteCharAt(0);
        }

        return str.toString();
    }
}