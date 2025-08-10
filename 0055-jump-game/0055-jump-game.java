class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        if(nums[0] == 0) return false;

        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> que = new LinkedList<>();
        que.offer(0);
        set.add(0);
    
        while(!que.isEmpty()) {
            int curr  = que.poll();
            for(int j = 1; j <= nums[curr]; j++) {
                int pos = curr + j;
                if(pos == n-1) return true;
                if(!set.contains(pos)) que.add(pos);
                set.add(pos);
            }
        }
        return false;
    }
}