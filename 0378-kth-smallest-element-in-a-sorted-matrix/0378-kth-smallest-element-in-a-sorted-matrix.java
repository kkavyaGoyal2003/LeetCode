class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int total = n * n;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(q.size() > total-k) q.poll();
                q.offer(matrix[i][j]);
            }
        }
        
        return  q.poll();
    }
}