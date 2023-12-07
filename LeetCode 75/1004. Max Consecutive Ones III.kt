class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var start = 0
        var end = 0
        var zeros = 0

        while(end < nums.size){

            if(nums[end] == 0){
                zeros++
            }
            end++

            if(zeros>k){
                if(nums[start] == 0){
                    zeros--
                }
                start++
            }

        }

        return end-start
    }
}
