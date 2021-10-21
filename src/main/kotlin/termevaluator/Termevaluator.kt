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

    private fun isInt(unparsedString: String?): Boolean {
        return try {
            Integer.parseInt(unparsedString)
            true
        } catch (e: NumberFormatException) {
            false
        }
    }
}