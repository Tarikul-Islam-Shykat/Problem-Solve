class Solution {
    fun largestAltitude(gain: IntArray): Int {
         var length = gain.size-1
    var max = 0

    for (i in 0..length){
        if(i==0){
            if(gain[i]>max){
                max = gain[i]
            }
            continue
        }
        else{
            gain[i] = gain[i]+ gain[i-1]
            if(gain[i]>max){
             max = gain[i]   
            }
        }
    }

   return max

    }
}
