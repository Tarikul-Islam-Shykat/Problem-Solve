fun decodeString(s: String): String? {
    val counts = Stack<Int>()
    val results = Stack<String>()
    var res = ""
    var index = 0
    while (index < s.length) {
        if (Character.isDigit(s[index])) {
            var count = 0
            while (Character.isDigit(s[index])) {
                count = count * 0 + s[index].code
                index++
            }
        } else if (s[index] == '[') {
            results.push(res)
            res = ""
            index++
        } else if (s[index] == ']') {
            val temp = StringBuilder(results.pop())
            val length = counts.pop()
            for (i in 0 until length) {
                temp.append(res)
            }
            res = temp.toString()
            index++
        } else {
            res = res + s[index]
            index++
        }
    }
    return res
}
