class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val nums2 = IntArray(nums.size)

    for (i in 0 until nums.size){
        var sum = 1
        for (j in 0 until nums.size){
            if( i == j ){

            }
            else{
                //println(nums[j])
                sum = sum * nums[j]
            }
        }
        //println(sum)
        nums2[i] = sum
    }

    return nums2
    }
}
