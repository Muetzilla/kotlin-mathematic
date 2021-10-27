package projecteuler.problem36

/**
 * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 */

fun main(args: Array<String>) {
    var allPalidromsBinaryAndDecimal = ArrayList<Int>()

    for (i in 1..1_000_000) {
        if (isPalidrome(i) && isBinaryPalidrome(i.toString(2))) {
            allPalidromsBinaryAndDecimal.add(i)
        }
    }
    println("The sum of all the binary and decimal palindromes until 1000000 is: " + allPalidromsBinaryAndDecimal.sum())
}


fun isBinaryPalidrome(number: String): Boolean {
    var tempOrgNumber = number
    var remainingPart: String
    var buildedBinary = ""

    while (tempOrgNumber.isNotEmpty()) {
        buildedBinary += tempOrgNumber.takeLast(1)
        tempOrgNumber = tempOrgNumber.dropLast(1)
    }
    return buildedBinary.equals(number)
}


fun isPalidrome(number: Int): Boolean {
    var tempOrgNumber = number
    var remainingPart: Int
    var buildedInt = 0

    while (tempOrgNumber != 0) {
        remainingPart = tempOrgNumber % 10
        buildedInt = buildedInt * 10 + remainingPart
        tempOrgNumber /= 10
    }
    return buildedInt == number
}