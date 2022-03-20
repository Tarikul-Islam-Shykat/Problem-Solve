fun main(args: Array<String>){

    var scanner = Scanner(System.`in`)

    var checkString: String = scanner.nextLine()
    var alphabet = "abcdefghijklmnopqrstuvwxyz"

    var length  = alphabet.length
    var count = 0
    for (a in 1..length-1 )
    {

        var result =  checkString.toLowerCase().contains(alphabet[a])
        if(result == true){
            count = count + 1
        }
        else
        {

        }
    }

    if(count == 25)
    {
        println("pangram")
    }
    else
    {
        println("not pangram")
    }
}
