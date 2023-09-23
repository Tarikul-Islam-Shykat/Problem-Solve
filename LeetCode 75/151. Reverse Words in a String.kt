class Solution {
    fun reverseWords(s: String): String {
        var s = s.split(" ")
    println(s)

    var result = ""

    for( i in s.size-1 downTo  0){
        if(s[i].equals("")){

        }
        else {
            result = result + s[i].trim() + " "
            result.trim()
        }
    }
    return result.trim()
    }
}
