class Solution {
    public int brokenCalc(int startValue, int target) {
        int steps = 0;
        int num = target;
        while(num > startValue) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num += 1;
            }
            steps++;
        }

        return steps + startValue - num;
        // return dfs(startValue, target);
    }
    // private int dfs(int startValue, int target) {
    //     if(startValue == target) return 0;

    //     int c1 = 0;
    //     int c2 = 0;
    //     if(startValue < target) {
    //         c1 += dfs(startValue*2, target);
    //     } 
    //     c2 += dfs(startValue-1, target);

    //     return c1+c2;
    // }
}