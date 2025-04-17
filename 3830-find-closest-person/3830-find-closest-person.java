class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z) < Math.abs(y-z)) {
            return 1;
        } 
        if(Math.abs(y-z) < Math.abs(x-z)) {
            return 2;
        }
        return 0;
    }
}