import java.time.YearMonth
import java.util.*

fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)

    var arr_size = sc.nextInt()

    var arr = arrayOfNulls<Int>(arr_size)

    for (i in 0..arr_size - 1) {
        arr[i] = sc.nextInt()
    }
    for (i in 1..arr_size-1){
        var current_item = arr[i]
        var prev_index = i -1;

        while (prev_index>=0 && arr[prev_index]!! > current_item!!){
            arr[prev_index+1] = arr[prev_index]
            prev_index--
        }
        arr[prev_index+1] = current_item
    }
    for(i in 0..arr_size-1){
        print("${arr[i]} ")
    }
}
