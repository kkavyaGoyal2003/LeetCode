class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] time = new int[n];
        int curr = 0; int prev = 0;
        Stack<Integer> stk = new Stack<>();


        for(String log: logs) {
            String[] tasks = log.split(":");
            int id = Integer.parseInt(tasks[0]);
            String status = tasks[1];
            curr = Integer.parseInt(tasks[2]);

            if(status.equals("start")) {
                if(!stk.isEmpty()) {
                    time[stk.peek()] += curr-prev;
                }
                stk.push(id);
                prev = curr;
            } else {
                time[stk.pop()] += curr-prev+1;
                prev = curr+1;
            }

        }

        return time;
    }
}