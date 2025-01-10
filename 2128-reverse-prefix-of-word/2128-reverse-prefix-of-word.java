class Solution {
    public String reversePrefix(String word, char ch) {
        int len = word.length();
        char [] wrd = word.toCharArray();
        if(len == 1) return word;
        int index = -1;
        for(int i = 0; i < len; i++) {
            if(ch == wrd[i]) {
                index = i ;
                break;
            }
        }
        StringBuilder str = new StringBuilder();

        for(int i = index; i >= 0; i--) {
            str.append(wrd[i]);
        }
        for(int i = index + 1; i < len; i++) {
            str.append(wrd[i]);
        }

        return str.toString();
    }
}