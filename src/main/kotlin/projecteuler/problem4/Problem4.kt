package projecteuler.problem4

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

fun main(args: Array<String>) {
    var largest3DigitPalindrome = ArrayList<Int>()
    for (i in 100 until 999) {
        for (j in 100 until 999) {
            if (isPalidrome(i * j)) {
                largest3DigitPalindrome.add(i * j)
            }
        }
    }
    print("The largest 3 digit palidrome is: " + largest3DigitPalindrome.maxOrNull())
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