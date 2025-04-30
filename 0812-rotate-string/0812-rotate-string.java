class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;

        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        
        int sLen = s.length();
        int goalLen = goal.length();


        for(int i = 0; i < sLen; i++) {
            q1.offer(s.charAt(i));
        }

        for(int i = 0; i < goalLen; i++) {
            q2.offer(goal.charAt(i));
        }

        for(int i = 0; i < goalLen; i++) {
            char ch = q2.poll();
            q2.offer(ch);

            if(q1.equals(q2)) return true;
        }

        return false;
    }
}
