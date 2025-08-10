class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n < 2)return 0;
        int steps = 1;
        Queue<Integer> que = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        que.offer(0);
        set.add(0);
        while(!que.isEmpty()) {
            int len = que.size();
            for(int i = 0; i < len; i++) {
                int curr = que.poll();
                for(int j = 1; j < nums[curr] + 1; j++) {
                    int pos = curr + j;
                    if(pos == n-1) return steps;
                    if(!set.contains(pos)) {
                        que.offer(pos);
                        set.add(pos);
                    }
                }
            }
            steps++;
        }

        return steps;
    }
}