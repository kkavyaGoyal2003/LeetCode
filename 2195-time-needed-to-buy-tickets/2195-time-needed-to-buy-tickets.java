class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length; 
        Queue<Integer> que = new LinkedList<>();

        for(int i =0; i < n; i++) {
            que.offer(i);
        }

        int time = 0;
        while(!que.isEmpty()) {
            int index = que.poll();

            if(tickets[index] > 0) {
                tickets[index]--;
                if(tickets[index] > 0) {
                    que.offer(index);
                }
                time++;
            }
            if(index == k && tickets[index] == 0) return time;
        }

        return time;
    }
}