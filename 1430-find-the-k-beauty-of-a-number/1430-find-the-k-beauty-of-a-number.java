class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int len = str.length();

        int div = 0;
        for(int i = 0; i < len-k+1; i++) {
            int cnt = 0;
            int n = 0;
            while(cnt < k) {
                char c = str.charAt(i + cnt);
                int temp = c - '0';
                n = (n*10) + temp;
                cnt++;
            }

            if(n != 0 && num % n == 0) div++;
        }
        return div;
    }
}