class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(i, score[i]);
        }

        List<Map.Entry<Integer, Integer>> list= new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        String[] sol = new String[n];

        for(int i = n - 1; i >= 0; i--) {
            if(i == n - 1) {
                sol[list.get(i).getKey()] = "Gold Medal";
            } else if(i == n - 2) {
                sol[list.get(i).getKey()] = "Silver Medal";
            } else if(i == n - 3) {
                sol[list.get(i).getKey()] = "Bronze Medal";
            } else {
                sol[list.get(i).getKey()] = Integer.toString(n-i);
            } 
        }

        return sol;
    }
}