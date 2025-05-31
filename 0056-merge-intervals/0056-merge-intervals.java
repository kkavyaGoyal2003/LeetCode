class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n == 1) return intervals;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> list = new ArrayList<>();

        int[] temp = intervals[0];
        list.add(temp);

        for(int i = 1; i < n; i++) {
            int[] next = intervals[i];
            if(temp[1] >= next[0]) {
                temp[1] = Math.max(temp[1], next[1]);
            } else {
                temp = next;
                list.add(temp);
            }
        }       
        int[][] sol = list.toArray(new int[list.size()][]);
        return sol;
    }
}