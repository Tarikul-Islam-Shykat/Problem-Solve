class Solution {
    public boolean canJump(int[] nums) {
        int final_pos_index = nums.length -1;
        for(int idx = nums.length -2; idx >=0 ; idx--){
            if(idx + nums[idx] >= final_pos_index){
                final_pos_index = idx;
            }
        }
        return final_pos_index == 0;   
    }
}
