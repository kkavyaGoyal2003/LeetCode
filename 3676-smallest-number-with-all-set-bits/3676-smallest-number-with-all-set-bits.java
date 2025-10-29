class Solution {
    public int smallestNumber(int n) {
        if(n == 1) return 1;
        int p = 0;
        int num = 1;
        while (num <= n) {
            num = (int)( Math.pow(2, p));
            p++;
        }

        return num - 1;
    }
}