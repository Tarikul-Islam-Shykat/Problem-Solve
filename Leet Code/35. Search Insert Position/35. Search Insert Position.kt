class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0;
    var end = nums.size - 1

    while (start<=end){
        val mid = (start+end) /2

        if(nums[mid] == target){
            return mid
        }
        else if(target>nums[mid])
            start = mid + 1
        else
            end = mid - 1
    }

    return  end + 1
    }
}
