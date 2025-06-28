class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> sol = new ArrayList<>();
        helper(num, 0, "", 0L, 0L, target, sol);
        return sol;
    }

    private void helper(String num, int pivot, String path, long calc, long tail, int target, List<String> sol) {
        if (pivot == num.length()) {
            if (calc == target) {
                sol.add(path);
            }
            return;
        }

        for (int i = pivot; i < num.length(); i++) {

            if (num.charAt(pivot) == '0' && i != pivot) continue;

            long curr = Long.parseLong(num.substring(pivot, i + 1));

            if (pivot == 0) {
                helper(num, i + 1, path + curr, curr, curr, target, sol);
            } else {
                helper(num, i + 1, path + "+" + curr, calc + curr, curr, target, sol);
                helper(num, i + 1, path + "-" + curr, calc - curr, -curr, target, sol);
                helper(num, i + 1, path + "*" + curr, calc - tail + tail * curr, tail * curr, target, sol);
            }
        }
    }
}
