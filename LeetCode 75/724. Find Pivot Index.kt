class Solution {
    fun pivotIndex(nums: IntArray): Int {
        
    var total_sum = nums.sum()
    var arr_length = nums.size-1
    var left_sum = 0

    for (index in 0..arr_length){

        var result = total_sum - left_sum - nums[index]

        if(result == left_sum){
            return  index
        }

        left_sum += nums[index]
    }


    return  -1
        
    }
}
