class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        if(nums[0] >= 0) {
            while(k > 0) {
                nums[0] = -1 * nums[0];
                k--;
            }  
        } else {
            int index = -1;

            for(int i = 0; i < n; i++) {
                if(nums[i] <= 0) {
                    index = i;
                }
            }

            if(nums[index] != 0) {
                int i = 0;
                while(k > 0) {
                    if(i <= index) {
                        nums[i] = -1 * nums[i];
                        i++;
                        k--;
                    } else {
                        if(k % 2 != 0) {
                            Arrays.sort(nums);
                            nums[0] =  (-1) * nums[0];
                        }
                        break;
                    }
                    
                }
            } else {
                int i = 0;
                while(k > 0) {
                    if(i < index) {
                        nums[i] = -1 * nums[i];
                        i++;
                    } else {
                        nums[i] = -1 * nums[i];
                    }
                    k--;
                }
            }
        }

        int sum = 0;
        for(int ele : nums) {
            sum += ele;
        }

        return sum;
    }
}