class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        for(int i = 1; i < numRows; i++) {
            generateTree(i);
        }
        return result;
    }
    private void generateTree(int r) {
        List<Integer> prev = result.get(r-1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i = 1; i < r; i++) {
            int val = (prev.get(i-1) + prev.get(i));
            row.add(val);
        }
        row.add(1);
        result.add(row);
    }
}