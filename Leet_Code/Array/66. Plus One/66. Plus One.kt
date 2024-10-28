class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for(i in digits.size-1 downTo  0){
        if(digits[i] == 9){
            digits[i] =0
        }
        else {
            digits[i] = digits[i]+1
            return digits
        }
    }
    var new_arr = IntArray(digits.size+1)
    new_arr[0] = 1; 
    return  new_arr;
    }
}
