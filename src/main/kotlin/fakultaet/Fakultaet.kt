package fakultaet

fun main(args: Array<String>) {
    var validInput = false
    var number = 0
    do {
        print("Enter the input > ")
       var  unparsedInput = readLine().toString()
        if (isInt(unparsedInput)) {
            number = Integer.parseInt(unparsedInput)
            validInput = true
        } else {
            println("$unparsedInput is not a valid input")
        }
    } while (!validInput)

    var faculty = 1

    for (i in 1..number){
        faculty *= i
        println(faculty)
    }

    println("The faculty of $number is $faculty.")
}


private fun isInt(unparsedString: String?): Boolean {
    return try {
        Integer.parseInt(unparsedString)
        true
    } catch (e: NumberFormatException) {
        false
    }
}