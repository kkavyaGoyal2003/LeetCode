class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length();
        int white  = 0;
        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W') white++;
        }
        int operation = white;

        for(int i = k; i < len; i++) {
            if (blocks.charAt(i - k) == 'W') white--;
            if (blocks.charAt(i) == 'W') white++;
            operation = Math.min(operation, white);
        }

        return operation;
    }
}