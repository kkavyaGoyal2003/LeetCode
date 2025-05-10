class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        for(int i :  arr) {
            if(!stk.isEmpty() && i < stk.peek()) {
                int max = stk.pop();
                while(!stk.isEmpty() && i < stk.peek()) {
                    stk.pop();
                }
                stk.push(max);
            } else {
                stk.push(i);
            }
        }

        return stk.size();
    }
}