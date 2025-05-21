class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, Set<Integer>> uam = new HashMap<>();
        int[] answer = new int [k];

        for(int i = 0; i < logs.length; i++) {
            int user = logs[i][0];
            int time = logs[i][1];
            if(!uam.containsKey(user)) {
                uam.put(user, new HashSet<>());
            } 

            uam.get(user).add(time);
        }

        for(Map.Entry<Integer, Set<Integer>> ele : uam.entrySet()) {
            int  val = ele.getValue().size();
            answer[val - 1] += 1;
        }
        return answer;
    }
}