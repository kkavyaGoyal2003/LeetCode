class Solution {
    public String reversePrefix(String word, char ch) {
        int len = word.length();
        String str = "";
        int index = -1;
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < len; i++) {
            if(word.charAt(i) == ch) {
                stk.push(ch);
                index = i+1;
                break;
            }
            stk.push(word.charAt(i));
        }
        if(stk.isEmpty() || index == -1) return word;

        while(!stk.isEmpty()) {
            char c = stk.pop();
            str += c;
        }
        if(index == len) return str;
        for(int i = index; i < len; i++) {
            char c = word.charAt(i);
            str += c;
        }

        return str;
    }
}