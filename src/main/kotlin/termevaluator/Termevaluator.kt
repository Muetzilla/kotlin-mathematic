package termevaluator


fun main(args: Array<String>) {
    var enteredTerm = ""
    val termevaluator = Termevaluator()
    print("Please enter your term > ")
    enteredTerm = readLine().toString()
    print("Your term is: $enteredTerm")
    termevaluator.parseIntsFromTerm(enteredTerm)
}

class Termevaluator {
    fun parseIntsFromTerm(termToPars: String): List<Int> {
        val numbersOfTerm = ArrayList<Int>()
        val unparsedInts = termToPars.replace("\\s+".toRegex(), "").split("+").toCollection(ArrayList())
        for (s in unparsedInts) {
            if (isInt(s)) {
                numbersOfTerm.add(Integer.parseInt(s))
            }
        }
        return numbersOfTerm
    }

    fun parseOperatorsFromTerm(termToPars: String): List<Operations> {
        val operationsofTerm = ArrayList<Operations>()

        for (c in termToPars) {
            when (c) {
                '+' -> {
                    operationsofTerm.add(Operations.Addition)
                }
                '-' -> {
                    operationsofTerm.add(Operations.Subtraction)
                }
                '*' -> {
                    operationsofTerm.add(Operations.Multiplication)
                }
                '/', ':' -> {
                    operationsofTerm.add(Operations.Division)
                }
            }
        }
        return operationsofTerm
    }

    fun checkCorrectTerm(listOfNumbers: ArrayList<Int>, listOfOperators: ArrayList<Operations>): Boolean {
        return listOfNumbers.size >= 1 && listOfNumbers.size == listOfOperators.size + 1
    }

    private fun isInt(unparsedString: String?): Boolean {
        return try {
            Integer.parseInt(unparsedString)
            true
        } catch (e: NumberFormatException) {
            false
        }
    }
}
