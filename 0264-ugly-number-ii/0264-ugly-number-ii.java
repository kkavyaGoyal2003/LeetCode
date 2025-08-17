class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        int[] pf = new int[] {2, 3, 5};

        long num = 1l;
        pq.offer(num);
        set.add(num);

        while(n > 0) {
            num = (pq.poll());
            n--;
            for(int i : pf) {
                long temp = num * i;
                if(!set.contains(temp)) {
                    pq.offer(temp);
                    set.add(temp);
                }
            }
        }
        return (int)num;
    }
}