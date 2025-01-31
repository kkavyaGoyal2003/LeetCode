class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] sol = new int[2];
        int i = 0; 
        int j = n-1;

        while(i < j) {
            int sum = numbers[i] + numbers[j];
            if(sum == target) {
                sol[0] = i+1;
                sol[1] = j+1;
                return sol;
            } else if (sum < target){
                i++;
            } else {
                j--;
            }
        }

        return sol;
    }
}