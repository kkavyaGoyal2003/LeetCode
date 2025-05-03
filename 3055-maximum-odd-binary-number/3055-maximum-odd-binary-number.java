class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len = s.length();

        int setCount = 0;
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '1') setCount++;
        }

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < len-1; i++) {
            if(setCount > 1) {
                str.append('1');
                setCount--;
            } else {
                str.append('0');
            }
        }

        str.append('1');

        return str.toString();
    }
}