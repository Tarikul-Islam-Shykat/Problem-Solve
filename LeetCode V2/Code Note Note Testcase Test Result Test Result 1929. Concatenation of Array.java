class Solution {
    public int[] getConcatenation(int[] nums) {
        int total_length = 2 * nums.length;
        int[] ans = new int[total_length];
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            count = i;
        }
        count++;
        for (int i = 0; i < nums.length; i++){
            ans[count] = nums[i];
            count++;
        }
        return ans;
    }
}
