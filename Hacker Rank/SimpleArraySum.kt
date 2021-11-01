import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    var size = sc.nextInt()


    var num = IntArray(size)

    for(i in 0 .. (size-1))
        num[i] = sc.nextInt()

    var sum =0

    for (a in num)
        sum+=a

    print(sum)
}
