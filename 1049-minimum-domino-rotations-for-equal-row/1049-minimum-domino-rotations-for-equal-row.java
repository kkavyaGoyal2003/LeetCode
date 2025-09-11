class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int count = changeTops(tops, bottoms, tops[0]);
        if(count != -1) return count;
        return changeTops(tops, bottoms, bottoms[0]);
    }
    private int changeTops(int[] tops, int[] bottoms, int key) {
        int t = 0;
        int b = 0;
        for(int i = 0; i < tops.length; i++) {
            if(tops[i] != key &&  bottoms[i] != key) return -1;
            if(tops[i] == key &&  bottoms[i] == key) continue;
            if(tops[i] == key) b++;
            if(bottoms[i] == key) t++;
        } 
        System.out.println(t + "   " + b);

        return Math.min(t, b);
    }

}