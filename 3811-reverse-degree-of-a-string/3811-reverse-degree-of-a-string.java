class Solution {
    public int reverseDegree(String s) {
        int len = s.length();
        int sum = 0;

        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);

            sum += ( 26 - (ch - 'a')) * (i + 1);
        }

        return sum;
    }
}