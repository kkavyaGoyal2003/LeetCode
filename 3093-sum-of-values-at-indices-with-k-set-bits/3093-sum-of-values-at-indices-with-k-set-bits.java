class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int size = nums.size();
        int sum = 0;

        for(int i = 0; i < size; i++) {

            if(calcSetBits(i) == k) sum += nums.get(i);
        }

        return sum;
    }

    public int calcSetBits(int no) {
        int count = 0;
        
        while(no != 0) {
            no &= (no - 1);
            count++;
        }

        return count;
    }
}