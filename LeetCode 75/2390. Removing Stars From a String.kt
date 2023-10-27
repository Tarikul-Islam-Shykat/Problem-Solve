
val res = StringBuilder()
    for (c in s.toCharArray()) {
        if (c == '*') {
            res.setLength(res.length - 1)
        } else {
            res.append(c)
        }
    }
