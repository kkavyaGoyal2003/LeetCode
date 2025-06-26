class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1.0;

        double re = myPow(x, n/2);
        if(n < 0) x = 1/x;
        if(n % 2 == 0) {
            return re*re;
        } else {
            return re*re*x;
        }
    }
}