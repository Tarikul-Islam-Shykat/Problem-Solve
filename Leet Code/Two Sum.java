# RESUTLT :  Runtime 1 ms Beats 99.39%
  
  
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer>  complements =  new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            Integer complementIndex = complements.get(nums[i]);
            
            if(complementIndex == null){
                complements.put(target - nums[i], i);
            } 
            
            else if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }

        }
        return  nums;
    }
}
  
