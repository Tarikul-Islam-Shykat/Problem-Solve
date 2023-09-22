class Solution {
    fun reverseVowels(s: String): String {
        val vowels = listOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var result = s.toCharArray()

        var first_point   = 0
        var last_point = s.lastIndex

        while (first_point < last_point){

        if (!vowels.contains(s[first_point])){
            first_point++
            continue // if true, doesn't execute the rest of the code
        }

        if (!vowels.contains(s[last_point])){
            last_point--
            continue // if true, doesn't execute the rest of the code
        }

        result[first_point] = s[last_point]
        result[last_point] = s[first_point]


        first_point++
        last_point--
    }

    return result.joinToString("")


    }
}
