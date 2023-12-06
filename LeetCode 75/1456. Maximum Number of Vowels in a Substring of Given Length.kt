class Solution {
    fun maxVowels(s: String, k: Int): Int {
        var s = s.toCharArray()
    var max = 0
    var finish = false
    var count = 0;
    for ( i in 0..s.size-1){
        if(i < k ){
            when(s[i]){
                'a','e','i','o','u' -> count++
            }
            max  = count
        }
        else{

            var outOfWindow = s[i-k]
            when(outOfWindow){
                'a','e','i','o','u' -> count--
            }

            var inWindow = s[i]
            when(inWindow){
                'a','e','i','o','u' -> count++
            }
            max = Math.max(max, count)
        }
    }
    
    return max
    }
}
