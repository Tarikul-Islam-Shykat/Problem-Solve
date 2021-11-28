import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    var size = sc.nextInt()
    var num = LongArray(size)

    for(i in 0 .. (size-1))
        num[i] = sc.nextLong()

    var sum: Long =0

    for (a in num)
        sum +=a

    println(sum)
}
