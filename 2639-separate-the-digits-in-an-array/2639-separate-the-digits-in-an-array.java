class Solution {
    public int[] separateDigits(int[] nums) {
        int len = nums.length;

        String str = "" ;
        for(int i : nums) {
            str += i;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(char c : str.toCharArray()) {
            list.add(Character.getNumericValue(c));
        }
        
        int[] sol = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            sol[i] = list.get(i);
        }

        return sol;
    }
}