class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();

        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        for(int i : nums1) {
            h1.add(i);
        }

        for(int i : nums2) {
            h2.add(i);
        }

        for(int ele : h1) {
            if(!h2.contains(ele)) n1.add(ele);
        }

        for(int ele : h2) {
            if(!h1.contains(ele)) n2.add(ele);
        }

        answer.add(n1);
        answer.add(n2);

        return answer;
    }
}