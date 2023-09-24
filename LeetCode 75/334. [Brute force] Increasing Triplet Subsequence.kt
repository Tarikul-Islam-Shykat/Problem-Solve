class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        var check:Boolean = false
    for (i in 0 until nums.size){
        var j = i + 1
        var k = i + 2
        if(k > nums.size-1){
            break
        }

        else{
            if(nums[i] < nums[j] && nums[j]<nums[k]){
                check = true
                break
            }
        }
    }
    return check
    }
}

// 66/83 passed
