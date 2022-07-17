import java.util.Scanner

fun main(args: Array<String>) {

    var sc = Scanner(System.`in`)

    var input = sc.next()
    var start = sc.nextInt()
    var end = sc.nextInt()

    for(i in start..end-1){
        print(input[i])
    }
}
// https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=false
