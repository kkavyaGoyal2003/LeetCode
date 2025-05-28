class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            int sum = sumOfDigit(i);
            map.put(sum, map.getOrDefault(sum , 0) + 1);
        }
        int max = -1;
        for(Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if(max < ele.getValue()) max = ele.getValue();
        }

        int count = 0;
        for(Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if(max == ele.getValue()) count++;
        }

        return count;
    }
    public int sumOfDigit(int i) {
        int sum = 0;
        while(i > 0) {
            int rem = i % 10;
            sum += rem;
            i /= 10;
        }

        return sum;
    }
}