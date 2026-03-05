class Solution {
    public int minOperations(String s) {
        int len = s.length();
        
        int zero = 0;
        int one = 0;
        for(int i=0; i<len; i++) {
            char bit = s.charAt(i);
            if(i%2 == 0) {
                if(bit == '1') zero++;
                else one++;
            } else {
                if(bit == '0') zero++;
                else one++;
            }
        }

        return Math.min(zero, one);
    }
}