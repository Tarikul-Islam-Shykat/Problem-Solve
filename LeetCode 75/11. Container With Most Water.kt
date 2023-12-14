class Solution {
    fun maxArea(height: IntArray): Int {
        var starting_pointer : Int = 0
    var endining_pointer : Int = height.size-1
    var max_height : Int = 0


    while ( starting_pointer <= endining_pointer){
        var min  : Int = Math.min(height[starting_pointer], height[endining_pointer])
        var area : Int  = min * (endining_pointer - starting_pointer)
        max_height = Math.max(max_height, area)

        if (height[starting_pointer] < height[endining_pointer]) {
            starting_pointer++
        } else {
            endining_pointer--
        }
        
    }
    return max_height
    }
}
