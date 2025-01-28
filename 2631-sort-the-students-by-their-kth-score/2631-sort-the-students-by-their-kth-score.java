class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        if(m == 1 ) return score;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++) {
            map.put(i , score[i][k]);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        int[][] sol = new int [m][n];
        for(int i = 0 ; i < m; i++) {
            int r = list.get(i).getKey();
            for(int j = 0 ; j < n; j++) {
               sol[m-1-i][j] = score[r][j];
            }
        }
        
        return sol;
    }
}