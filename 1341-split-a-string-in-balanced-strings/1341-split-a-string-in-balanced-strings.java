class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int right = 0;
        int len = s.length();

        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(c == 'R') {
                right++;
            } else {
                right--;
            }

            if(right == 0) count++;
        }

        return count;
    }
}