class Solution {
    public String removeDuplicates(String s, int k) {
        int len = s.length();
        Stack<Character> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(stk1.isEmpty()) {
                stk1.push(c);
                stk2.push(1);
            } else {
                if(c == stk1.peek()) {
                    int temp = stk2.pop();
                    stk2.push(temp+1);
                } else {
                    stk1.push(c);
                    stk2.push(1);
                }
            }
            if(stk2.peek() == k) {
                stk1.pop();
                stk2.pop();
            }
        }

        StringBuilder str = new StringBuilder();
        while(!stk1.isEmpty()) {
            int temp = stk2.pop();
            char c = stk1.pop();
            for(int i = 0; i < temp; i++) {
                str.append(c);
            }
            System.out.println(c);
        }

        return str.reverse().toString();
    }
}