class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;
        int[] depend = new int[numCourses];
        
        for(int i = 0; i < prerequisites.length; i++) {
            depend[prerequisites[i][0]]  += 1;
        }

        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(depend[i] == 0) que.add(i);
        }
        if(que.size() == 0) return false;

        while(!que.isEmpty()) {
            int temp = que.poll();
            for(int i = 0; i < prerequisites.length; i++) {
                if(prerequisites[i][1] == temp)  {
                    depend[prerequisites[i][0]]  -= 1;
                    if(depend[prerequisites[i][0]]  == 0) que.add(prerequisites[i][0]);
                } 
            }
        }
        
        for(int i = 0; i < numCourses; i++) {
            if(depend[i]  != 0) return false;
        }

        return true;
    }
}