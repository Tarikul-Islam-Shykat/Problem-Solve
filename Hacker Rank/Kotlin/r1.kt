import java.util.Scanner

fun main(args: Array<String>) {

    var sc = Scanner(System.`in`)

    var n : Int = sc.nextInt()


   for (i in 1..10)
    {
        println("${n} x ${i} = ${i*n}")
    }
}

// https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=false
