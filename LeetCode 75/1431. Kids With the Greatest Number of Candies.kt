class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var result = BooleanArray(candies.size)
    
    val max = candies.max()!!
    for( i in 0 until candies.size){
        var total_candie =extraCandies + candies[i]
        if ( total_candie >= max )
            result[i] = true
        else
            result[i] = false
    }

    return result.toList()

    }
