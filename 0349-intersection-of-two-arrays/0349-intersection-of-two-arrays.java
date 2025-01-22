class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(i < n1 &&  j < n2){
            if(nums1[i] == nums2[j]) {

                if(list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        i = 0;
        int [] ans = new int[list.size()];
        for(i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}