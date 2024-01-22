class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
       if (word1.length != word2.length) return false

    val frequency1 = word1.asSequence().groupingBy { it }.eachCount()
    val frequency2 = word2.asSequence().groupingBy { it }.eachCount()
    
    if (frequency1.values.toList().sorted() != frequency2.values.toList().sorted()) return false
    if (frequency1.keys.toList().sorted() != frequency2.keys.toList().sorted()) return false
    return true
    }
}
