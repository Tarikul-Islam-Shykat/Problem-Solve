class Solution {
    fun moveZeroes(nums: IntArray): Unit {
    var count = 0;
    for (i in 0..nums.size-1){

        if (nums[i] == 0){

            continue
        }
        else{
            nums[count] = nums[i]
            count += 1
        }
    }

    var zeroes = nums.size - count +1

    var i = 1;
    while ( i != zeroes){
        var position = nums.size  - i
        nums[position] = 0
        i++
    }


    for(i in 0..nums.size-1){
        println(nums[i])
    }
    }
}
