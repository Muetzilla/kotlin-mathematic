package projecteuler.problem4


fun main(args: Array<String>) {
    var largest3DigitPalindrome = 0;
    for (i in 100 until 999) {
        for (j in 100 until 999) {
            if (isPalidrome(i * j)) {
                largest3DigitPalindrome = i * j
            } else {
                println("THE RESULT FOR i is $i and j is $j IS: " + i * j)
            }
        }
    }
    print("The largest 3 digit palidrome is $largest3DigitPalindrome")
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