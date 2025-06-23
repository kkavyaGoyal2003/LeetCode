class Solution {
    public int countArrangement(int n) {

        return countPerm(n, new HashSet<>(), 1);

    }
    
    private int countPerm(int n,HashSet<Integer> set, int ind) {
        if(ind > n) return 1;

        int count = 0;
        for(int i = 1; i < n+1; i++) {
            if(!set.contains(i) && isBeautiful(ind, i)) {
                set.add(i);
                count += countPerm(n, set, ind+1);
                set.remove(i);
            }
        }
        return count;
    }
    private boolean isBeautiful(int ind, int val) {

        return ((ind % val == 0) || (val % ind == 0));
    }
}