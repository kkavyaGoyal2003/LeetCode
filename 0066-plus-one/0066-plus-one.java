class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        ArrayList<Integer> temp = new ArrayList<>();

        int carry = 0;
        for(int i = n-1; i >= 0; i--) {
            if(i == n-1) {
                if(digits[i] < 9) {
                    temp.add(digits[i] + 1);
                } else {
                    temp.add(0);
                    carry = 1;
                }
            } else {
                if(digits[i] == 9 && carry == 1) {
                    temp.add(0);
                } else {
                    temp.add(digits[i] + carry );
                    carry = 0;
                }
            }
            
        }

        if(carry == 1) temp.add(carry);
        Collections.reverse(temp);
        int []ans = temp.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}