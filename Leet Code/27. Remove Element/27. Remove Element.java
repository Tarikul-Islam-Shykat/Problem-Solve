class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            //System.out.println(i);
            //System.out.println(nums.length-1);
            if(i <= nums.length - 1 && nums[i]!= val){

                nums[count] = nums[i];
                count++;
                //continue;
            }
            else if (i < nums.length - 1 && nums[i]== val)
            {
                continue;
            }
            //nums[count] = nums[i];


        }
        /*for (int i = 0 ; i<nums.length; i++){
            System.out.print(" "+nums[i]);
        }*/
        return count;
    }
}
