import java.util.Scanner

fun main(args:Array<String>){
    var sc = Scanner(System.`in`)

    var number = sc.nextInt()
    val list: MutableList<Int> = mutableListOf()

    for (i in 1..number){
        if(number % i == 0)
            list.add(i)
    }

    var best_divisor = 0
    var best_divisor_sum = 0

    //println(list)

    for(element in list){
        var result  = sum_of_digits(element)
        if(result > best_divisor_sum){
            best_divisor = element
            best_divisor_sum = result
        }
    }

    println(best_divisor)
    //println(best_divisor_sum)

}

fun sum_of_digits(number: Int): Int {
    var sum:Int = 0
    var num: Int = number
    while (num>0){
        var remainder : Int = num % 10
        sum = sum + remainder
        num = (num/10)
    }
    return  sum
}

