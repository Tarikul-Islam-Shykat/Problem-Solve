class Solution {
     static int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i = 0; i<nums.length; i++) {
          
            current_sum = Math.max(current_sum + nums[i], nums[i]);;
            max_sum =  Math.max(max_sum, current_sum);
            
        }
     return max_sum;

    }
}
