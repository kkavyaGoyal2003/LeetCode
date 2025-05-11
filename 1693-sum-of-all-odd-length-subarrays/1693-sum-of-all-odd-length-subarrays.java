class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        int n = arr.length;

        int i = 0;
        while(i <  n) {
            int j = i;
            int temp = 0;
            while(j < n) {
                temp += arr[j];
                if((j - i + 1) % 2 == 1) sum += temp;
                j++;
            }
            i++;
        }

        return sum;
    }
}