class Solution {
    public long flowerGame(int n, int m) {
        long odd_n = 0;
        long even_n = 0;
        long odd_m = 0;
        long even_m = 0;

        if(n % 2 != 0) {
            odd_n = ((long)(n) / 2) + 1;
            even_n = (long)(n) - odd_n;
        } else {
            odd_n = ((long)(n) / 2); 
            even_n = ((long)(n) / 2);
        }

        if(m % 2 != 0) {
            odd_m = ((long)(m) / 2) + 1;
            even_m = (long)(m) - odd_m;
        } else {
            odd_m = ((long)(m) / 2); 
            even_m = ((long)(m) / 2);
        }

        long count = (odd_n * even_m) + (even_n * odd_m);

        return count;
    }
}