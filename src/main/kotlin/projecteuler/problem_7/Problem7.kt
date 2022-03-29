package projecteuler.problem_7

import java.lang.Math.sqrt

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
fun main(args: Array<String>) {
    var primeCounter = 0
    var currentNumber = 2

    while (true) {
        if (isPrime(currentNumber)) {
            if (++primeCounter == 10_001) {
                break
            }
        }
        currentNumber++
    }
    print("The 10 001st prime is: " + currentNumber)
}

private fun isPrime(num: Int): Boolean {
    //Check special cases
    if (num == 2) {
        return true
    }
    if (num % 2 == 0) {
        return false
    }
    if (num <= 1) {
        return false
    }

    val root = sqrt(num.toDouble()).toInt()
    var isPrime = true
    for (i in 3..root step 2) {
        if ((num % i) == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}
