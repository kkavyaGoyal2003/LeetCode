class Solution {
    public String interpret(String command) {
        int len = command.length();
        StringBuilder str = new StringBuilder();

        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < len; i++) {
            if(command.charAt(i) == ')') continue;
            if(command.charAt(i) == '(') {
                if(command.charAt(i+1) == ')') {
                    str.append('o');
                } else {
                    continue;
                }
            } else {
                str.append(command.charAt(i));
            }
        }

        return str.toString();
    }
}