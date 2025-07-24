class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        Arrays.sort(people, (a,b)-> {
            if(a[0] == b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });

        List<int[]> sol = new ArrayList<>();
        for(int[] p: people) {
            sol.add(p[1], p);
        }

        int[][] res = new int[n][];
        for(int i = 0; i < n; i++) {
            res[i] = sol.get(i);
        }

        return res;
    }
}