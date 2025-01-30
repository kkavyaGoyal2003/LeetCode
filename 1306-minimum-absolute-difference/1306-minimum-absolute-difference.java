class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            diff = Math.min(diff, arr[i]- arr[i-1]);
        }

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 1; i < n; i++) {
            List<Integer> sol = new ArrayList<>();
            if(arr[i] - arr[i-1] == diff) {
                sol.add(arr[i-1]);
                sol.add(arr[i]);
                list.add(sol);
            }
        }

        return list;
    }
}