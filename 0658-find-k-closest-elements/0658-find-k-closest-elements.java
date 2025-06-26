class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            int disA = Math.abs(a - x);
            int disB = Math.abs(b - x);

            if(disA == disB) {
                return b-a;
            } else {
                return disB-disA;
            }
        });

        for(int val : arr) {
            pq.offer(val);
            if(pq.size() > k) pq.poll();
        }

        List<Integer> li = new ArrayList<>();
        while(!pq.isEmpty()) {
            li.add(pq.poll());
        }
        Collections.sort(li);
        return li;
    }
}