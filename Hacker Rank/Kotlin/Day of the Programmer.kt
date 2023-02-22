import java.time.YearMonth
import java.util.*

fun main(args: Array<String>){
    var sc = Scanner(System.`in`)

    val year = sc.nextInt()
    var limit = 256

    if(year<1919) {
        var sum = 0
        for (i in 1..12) {
            sum = sum + numberOfDaysInMonth(year, i)
            if (limit - sum < 30) {
                var date = limit - sum
                println(date.toString() + "." + String.format("%02d", i + 1) + "." +year)
                break
            }
        }
    }
    else{
        var sum = 0
        for (i in 1..12) {
            sum = sum + numberOfDaysInMonth(year, i)
            if (limit - sum < 30) {
                var date = limit - sum
                println(date.toString() + "." + String.format("%02d", i+1) + "." +year)
                break
            }
        }
    }


}

fun numberOfDaysInMonth(year: Int , month:Int):Int
{
    var yearMonth: YearMonth = YearMonth.of(year, month)
    var daysInMonth = yearMonth.lengthOfMonth()
    return daysInMonth
}
