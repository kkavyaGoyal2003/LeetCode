class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int [] C = new int [n];

        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            listA.add(A[i]);
            listB.add(B[i]);
            int count = 0; 
            for(int j = 0; j <= i; j++) {
                if(listA.contains(A[j]) && listB.contains(A[j]) ) {
                    count += 1;
                }  
            } 
            C[i] = count;
        }       
        return C;
    }
}