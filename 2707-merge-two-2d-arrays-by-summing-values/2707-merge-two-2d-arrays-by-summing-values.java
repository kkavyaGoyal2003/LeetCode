class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n1 && j < n2) {
            List<Integer> sol = new ArrayList<>();
            if(nums1[i][0] == nums2[j][0]) {
                sol.add(nums1[i][0]);
                sol.add(nums1[i][1] + nums2[j][1]);
                i++;
                j++;
            } else if(nums1[i][0] < nums2[j][0]) {
                sol.add(nums1[i][0]);
                sol.add(nums1[i][1]);
                i++;
            } else {
                sol.add(nums2[j][0]);
                sol.add(nums2[j][1]);
                j++;
            }
            list.add(sol);
        }
        while(i < n1) {
            List<Integer> sol = new ArrayList<>();
            sol.add(nums1[i][0]);
            sol.add(nums1[i][1]);
            i++;
            list.add(sol);
        }
        while(j < n2) {
            List<Integer> sol = new ArrayList<>();
            sol.add(nums2[j][0]);
            sol.add(nums2[j][1]);
            j++;
            list.add(sol);
        }

        int len = list.size();
        int[][] ans = new int[len][2];

        for(i = 0; i < len; i++) {
            List<Integer> sol = list.get(i);
            for(j = 0; j < 2; j++) {
                ans[i][j] = sol.get(j);
            }
        }
        return ans;
    }
}