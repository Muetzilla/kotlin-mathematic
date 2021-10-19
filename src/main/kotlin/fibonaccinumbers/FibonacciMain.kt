package fibonaccinumbers

fun main(args: Array<String>) {
    var input = ""
    val fibCalculation = FibonacciMain()
    do {
        print("How many Fibonacci numbers should be printed > ")
        input = readLine().toString()
    } while (!fibCalculation.isInt(input))
    print("The first $input Fibonacci numbers are: " + fibCalculation.calculateFibonacciNumbers(Integer.parseInt(input)))
}

class FibonacciMain {
    fun calculateFibonacciNumbers(amountOfNumbers: Int): List<Int> {
        if (amountOfNumbers == 1) {
            return listOf(0);
        }
        val fibonacciNumbers = mutableListOf(0, 1)
        for (i in 2 until amountOfNumbers) {
            fibonacciNumbers.add(fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2])
        }
        return fibonacciNumbers
    }

    fun isInt(unparsedString: String?): Boolean {
        return try {
            Integer.parseInt(unparsedString)
            true
        } catch (e: NumberFormatException) {
            false
        }
    }
}

