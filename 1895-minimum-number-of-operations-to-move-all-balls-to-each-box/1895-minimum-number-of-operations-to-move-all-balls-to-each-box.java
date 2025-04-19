class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();

        HashSet<Integer> index = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(boxes.charAt(i) == '1') index.add(i);
        }

        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            for(int val : index) {
                answer[i] += Math.abs(val - i);
            }
        }

        return answer;
    }
}