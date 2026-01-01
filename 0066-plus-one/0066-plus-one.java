class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 0;

        for(int i = n-1; i >= 0; i--) {
            if(i == n-1) {
                if(digits[i] < 9) {
                    digits[i] += 1;
                } else {
                    digits[i] = 0;
                    carry = 1;
                }
            } else {
                if(digits[i] == 9 && carry == 1) {
                    digits[i] = 0;
                } else {
                    digits[i] += carry;
                    carry = 0;
                }
            }
            
        }

        if(carry == 0) return digits;

        int[] ans = new int[n+1];
        ans[0] = 1;

        for(int i = 1; i <= n; i++) {
            ans[i] = digits[i-1];
        }

        return ans;

    }
}