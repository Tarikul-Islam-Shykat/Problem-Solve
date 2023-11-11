class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
         int left_pointer = 0;
        int  right_pointer = nums.length - 1;

        int count = 0;

        while (left_pointer < right_pointer){
            if(nums[left_pointer] + nums[right_pointer] == k){
                count ++;
                left_pointer ++;
                right_pointer --;
            }
            else if(nums[left_pointer]+nums[right_pointer]<k){
               left_pointer++;
            }

            else{
                 right_pointer--;
            }
        
        }
        return count;

    }
}
