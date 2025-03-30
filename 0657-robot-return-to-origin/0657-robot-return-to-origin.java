class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        int n = moves.length();

        for(int i = 0; i < n; i++) {
            char c = moves.charAt(i);
            if(c == 'U') {
                y++;
            } else if(c == 'D') {
                y--;
            } else if(c == 'L') {
                x++;
            } else {
                x--;
            }
        }

        return (x == 0 && y == 0);
    }
}