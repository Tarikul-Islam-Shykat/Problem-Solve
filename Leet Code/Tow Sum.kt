# Result : Runtime 202 ms Beats 84.43%
  
  class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val complements = mutableMapOf<Int, Int>()

        for ( i in 0..nums.size-1){

            val complementIndex = complements.get(nums[i])

            if (complementIndex == null)
                complements[target - nums[i]] = i
            else if ( complementIndex != null)
                return intArrayOf(i, complementIndex)

        }
        return nums
    }
}
