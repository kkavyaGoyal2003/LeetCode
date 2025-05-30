class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while(i < nums.length) {
            int start = nums[i];

            while(i < nums.length - 1 &&  nums[i]+ 1 == nums[i+1]) {
                i++;
            }
            int last = nums[i];
            StringBuilder str = new StringBuilder();
            if(start == last)  {
                str.append(Integer.toString(start));  
            } else {
                str.append(Integer.toString(start) + "->" + Integer.toString(last));
            }
            list.add(str.toString());
            i++;
        }
        
        return list;
    }
}