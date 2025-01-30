class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stk = new Stack<>();

        for(int i: asteroids) {
            if(i > 0) {
                stk.push(i);
            } else {
                while(!stk.isEmpty() && stk.peek() > 0 && stk.peek() < Math.abs(i)) {
                    stk.pop();
                }
                if(!stk.isEmpty() && stk.peek() > 0 && stk.peek() == Math.abs(i)) {
                    stk.pop();
                    continue;
                }
                if(!stk.isEmpty() && stk.peek() > 0 && stk.peek() > Math.abs(i)) {
                    continue;
                }
                stk.push(i);
            }
        }
        int[] leftAst = new int[stk.size()];

        for(int i = stk.size() - 1; i >= 0; i--) {
            leftAst[i] = stk.pop();
        }
        return leftAst;
    }
}