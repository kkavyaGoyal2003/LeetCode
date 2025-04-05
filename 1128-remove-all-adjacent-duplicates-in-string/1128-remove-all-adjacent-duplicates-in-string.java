class Solution {
    public String removeDuplicates(String s) {
        int len = s.length();

        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()) {
            if(!stk.isEmpty() && stk.peek() == c)  {
                stk.pop();
            } else {
                stk.push(c);
            }
        }

        StringBuilder str = new StringBuilder();
        while(!stk.isEmpty()) {
            str.append(stk.pop());
        }

        return str.reverse().toString();
    }
}