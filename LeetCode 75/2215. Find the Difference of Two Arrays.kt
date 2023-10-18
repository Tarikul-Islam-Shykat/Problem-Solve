    val s1 = nums1.toMutableSet()
    val s2 = nums2.toMutableSet()

    val distincNumbs = arrayListOf<Int>()

    s1.forEach {
        if(!s2.contains(it))
            distincNumbs.add(it)
        else
            s2.remove(it)
    }

    return listOf(distincNumbs, s2.toList())
