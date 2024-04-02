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

// using one loop
// can be called using 2 pointers. used one loop to add items on the both side. 
class Solution {
    public int[] getConcatenation(int[] nums) {
        int total_length = 2 * nums.length;
        int[] ans = new int[total_length];
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i]; 
        }
        return ans;
    }
}
