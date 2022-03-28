package projecteuler.problem_5

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly diviible by all of the numbers from 1 to 20?
 */

fun main(args: Array<String>) {
    var currentNumber = 1
    var smallestValue = 0
    while (true) {
        var dividableNoRest = true
        for (i in 20 downTo 1) {
            if (currentNumber % i != 0) {
                dividableNoRest = false
                break
            }
        }
        if (dividableNoRest) {
            smallestValue = currentNumber
            break
        }
        currentNumber++
    }
    print("Smallest number that can be divided by each of the numbers from 1 to 20 without remainder: " + smallestValue)
}