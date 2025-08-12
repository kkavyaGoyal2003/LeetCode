class Solution {
    public boolean isRobotBounded(String instructions) {
        int len = instructions.length();
        int[][] dir = {{0, 1}, {-1, 0},{0,-1}, {1,0}};

        int x = 0;
        int y = 0;
        int pos = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < len; j++) {
                char c = instructions.charAt(j);
                if(c == 'G') {
                   x += dir[pos][0];
                   y += dir[pos][1]; 
                } else if(c == 'R') {
                    pos = (pos + 3) % 4;
                } else {
                    pos = (pos + 1) % 4;
                }
            }
        }

        return x == 0 && y == 0;
    }
}