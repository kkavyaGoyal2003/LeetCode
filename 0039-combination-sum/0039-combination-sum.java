class Solution {
    List<List<Integer>> sol = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        countPairs(candidates, target, 0, new ArrayList<Integer>());
        return sol;
    }
    public void countPairs(int[] candidates, int target, int ind , List<Integer> path) {
        if(target == 0) {
            sol.add(new ArrayList<>(path));
            return;
        }
        if(target < 0 || ind == candidates.length) return;

        path.add(candidates[ind]);
        countPairs(candidates, target - candidates[ind], ind, path);
        path.remove(path.size() - 1);
        countPairs(candidates, target, ind+1, path);
        
    }
}