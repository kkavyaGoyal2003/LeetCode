class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] ration = new int[n];

        ration[0] = 1;
        for(int i = 1; i < n; i++) {
            if(ratings[i-1] < ratings[i]) {
                ration[i] = Math.max(ration[i], ration[i-1] +1);
            } else {
                ration[i] = 1;
            }
        }
        int val = ration[n-1];
        for(int i = n-2; i >= 0; i--) {
            if(ratings[i+1] < ratings[i]) {
                ration[i] = Math.max(ration[i], ration[i+1] +1);
            }
            val += ration[i];
        }
        System.out.println(Arrays.toString(ration));
        return val;
    } 
}