class Solution {
    public String decodeString(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Integer> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        int num = 0;

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                num = (num * 10) + (c - '0');
            } else if(c == '[') {
                numStack.push(num);
                charStack.push(str.toString());
                num = 0;
                str.setLength(0);
            } else if(c == ']') {
                int n = numStack.pop();
                StringBuilder decode = new StringBuilder();

                for(int i = 0; i < n; i++) {
                    decode.append(str);
                }
                str = new StringBuilder(charStack.pop()).append(decode);

            } else {
                str.append(c);
            }
        }

        return str.toString();
    }
}