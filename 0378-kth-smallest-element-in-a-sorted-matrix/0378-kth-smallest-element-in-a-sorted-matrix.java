class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int total = n * n;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                q.offer(matrix[i][j]);
                if(q.size() > k) q.poll();    
            }
        }   
        return  q.poll();
    }
}