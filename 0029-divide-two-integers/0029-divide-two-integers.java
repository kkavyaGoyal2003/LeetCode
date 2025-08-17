class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;


        long num = Math.abs((long)(dividend));
        long den = Math.abs((long)(divisor));

        int res = 0;
        while(num >= den) {
            int shift = 0;
            while(num >= (den << shift)) {
                shift++;
            }
            shift--;
            res += Math.pow(2, shift);

            num = (num - (den << shift));
        }

        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) return res;

        return (-res);
    }
}