class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int found = 0;
        for (int i =0; i<nums.length; i++) {
            if(nums[i] == target) { // same number found case handling.
                return 1;
            }
            // different number found case handling
            sum = sum + nums[i];
            //System.out.println(sum);
            while (sum >= target){
               // System.out.println("enter " + found);
                int distance =  i -left + 1;
                if(found == 0 & distance > found){
                    found = distance;
                }else  {
                    found = Math.min(found, distance);
                }
                int minus = nums[left];
                sum = sum  - minus;
                left++;
                //System.out.println("exist "+found);
            }
        }
        //System.out.println("found : " + found);
        return found;
    }
}
