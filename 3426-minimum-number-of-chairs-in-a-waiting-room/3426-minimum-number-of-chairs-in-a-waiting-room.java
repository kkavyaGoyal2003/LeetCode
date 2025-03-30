class Solution {
    public int minimumChairs(String s) {
        int chair = 0;
        int empty = 0;
        int n = s.length();

        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            if(c == 'E') {
                if(empty != 0) {
                    empty--;
                } else {
                    chair++;
                }
            }
            if(c == 'L') {
                empty++;
            }
        }

        return chair;
    }
}