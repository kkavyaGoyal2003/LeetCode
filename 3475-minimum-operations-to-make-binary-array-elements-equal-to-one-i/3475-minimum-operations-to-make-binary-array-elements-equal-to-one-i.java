class Solution {
    public int minOperations(int[] nums) {

        Deque<Integer> que = new LinkedList<>();
        for(int i : nums) {
            que.offer(i);
        }

        int count = 0;
        while (que.contains(0)) {
            if (que.peek() == 0) {
                que.poll();
                que.addLast(1);
                int top1 = que.poll();
                int top2 = que.poll();
                if(top2 == 1) {
                    que.addFirst(0);
                } else {
                    que.addFirst(1);
                }
                if(top1 == 1) {
                    que.addFirst(0);
                } else {
                    que.addFirst(1);
                }
                count++;
            } else {
                int ele = que.poll();
                que.addLast(ele);
            }

            
            if (count > nums.length) return -1;
        }

        return count;
    }
}