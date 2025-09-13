class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) return new ArrayList<>(Arrays.asList(1));
        if(rowIndex == 1) return new ArrayList<>(Arrays.asList(1, 1));

        List<List<Integer>> dp = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++) {
            dp.add(new ArrayList<>());
        } 
        dp.get(0).add(1);
        dp.get(1).add(1);
        dp.get(1).add(1);

        for(int i = 2; i <= rowIndex; i++) {
            List<Integer> temp = dp.get(i);
            temp.add(1);
            int j = 0;

            while(j < i-1) {
                int sum = dp.get(i-1).get(j) + dp.get(i-1).get(j+1);
                temp.add(sum);
                j++;
            }
            temp.add(1);
        }

        return dp.get(rowIndex);
    }
}