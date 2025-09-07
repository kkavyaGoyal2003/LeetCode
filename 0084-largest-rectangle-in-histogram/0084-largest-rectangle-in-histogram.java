class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0; i<n; i++){
            while(st.peek() != -1 && heights[st.peek()] > heights[i]){
                int ind = st.pop();
                int r = i - st.peek() -1;
                max= Math.max(max, heights[ind] * r);
            }    
            st.push(i);
        }

        while(st.peek() != -1){
            int ind = st.pop();
            int r = n - st.peek() -1;

            max = Math.max(max, heights[ind] * r);
        }
        return max;
    }
}