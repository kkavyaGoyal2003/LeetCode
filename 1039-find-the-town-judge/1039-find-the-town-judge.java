class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] people = new int[n];
        int m = trust.length;

        // counting trust
        for(int i = 0; i < m; i++) {
            people[trust[i][1] - 1] += 1;
        }
        // System.out.println(people);
        //checking if more than one or even one of judge exists
        int count = 0;
        int ans = -1;
        for(int i = 0 ; i < n; i++) {
            if(people[i] == n-1) {
                count++;
                ans = i+1;
            }

        }
        
        if(count != 1) return -1;

        //checking condition 1
        for(int i = 0; i < m; i++) {
            if(trust[i][0] == ans) return -1;
        }

        return ans;
    }
}