class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();

        int sum = 0;
        int odd = 0;
        for(int i = 0; i < n; i++) {
            char c = num.charAt(i);
            if(i % 2 == 0) sum += (c - '0');
            else odd += (c - '0');
        }

        return sum == odd;
    }
}