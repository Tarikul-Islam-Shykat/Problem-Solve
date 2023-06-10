class Solution {
    fun removeElement(nums: IntArray, val_: Int): Int {
        var count = 0
    val size = nums.size-1
    for (i in 0..nums.size-1){
        if(i<=size && nums[i] != val_){
            nums[count] = nums[i]
            count += 1
        }
        else if(i<size && nums[i]==val_){
            continue
        }
    }
    
    return count
    }
}
