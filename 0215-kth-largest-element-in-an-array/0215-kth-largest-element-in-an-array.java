class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        int n = nums.length;
        int res = Integer.MAX_VALUE;

        for(int i : nums) {
            pq.offer(i);
            if(pq.size() > n-k) {
                res = Math.min(res, pq.peek());
                pq.poll();
            }
        }

        return res;
    }
}