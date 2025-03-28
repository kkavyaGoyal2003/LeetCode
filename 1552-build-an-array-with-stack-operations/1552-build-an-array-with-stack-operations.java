class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> op = new ArrayList<>();
        int len = target.length;
        int index = 0;

        for(int i=1; i<n+1; i++) {

            op.add("Push");

            if(target[index] != i) {
                op.add("Pop");
            } else {
                index++;
            }

            if(index == len) break;
        }

        return op;
    }
}