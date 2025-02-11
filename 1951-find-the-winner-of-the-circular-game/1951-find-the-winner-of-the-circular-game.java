class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> que = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            que.offer(i);
        }

        int count = 0;
        while(que.size() != 1) {
            count++;
            int num = que.poll();
            if(count % k == 0) continue;
            que.offer(num);
        }

        return que.poll();
    }
}