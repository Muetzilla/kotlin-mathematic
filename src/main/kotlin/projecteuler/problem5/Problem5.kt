package projecteuler.problem5

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

var primeFactors = ArrayList<Int>()

fun main(args: Array<String>) {
    for (i in 1..20) {
        getPrimsOfNumber(i)
    }
    print("ArrayList of prims: " + primeFactors.toString())
}

private fun getPrimsOfNumber(i: Int) {
    var numberToGetPrims = i
    var tempPrimeFactor = 2
    while (numberToGetPrims > 1) {
        while (numberToGetPrims % tempPrimeFactor == 0) {
            primeFactors.add(tempPrimeFactor)
            numberToGetPrims /= tempPrimeFactor
        }
        tempPrimeFactor++;
    }
}