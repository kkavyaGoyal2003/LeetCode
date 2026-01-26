class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = numCourses;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
    
        int[] indegree = new int[n];
        for(int[] p: prerequisites){
            adj.get(p[1]).add(p[0]);
            indegree[p[0]] += 1;
        }

        int i = 0;
        int[] order = new int[n];
        Queue<Integer> que = new LinkedList<>();
        for(int j = 0; j < n; j++) {
            if(indegree[j] == 0) que.add(j);
        }

        while(!que.isEmpty()) {
            int u = que.poll();
            order[i] = u;
            i++;

            for(int v: adj.get(u)) {
                indegree[v] -= 1;
                if(indegree[v] == 0) que.add(v);
            }
        }
        if(i == n) return order;
        return new int[] {};
    }
}