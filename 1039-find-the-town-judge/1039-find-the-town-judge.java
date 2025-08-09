class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] people = new int[n];
        int m = trust.length;

        // counting trust on and from people
        for(int i = 0; i < m; i++) {
            people[trust[i][0] - 1] -= 1;
            people[trust[i][1] - 1] += 1;
        }


        //checking if more than one or even one of judge exists
        for(int i = 0 ; i < n; i++) {
            if(people[i] == n-1) return i+1;
        }
        
        return -1;
    }
}