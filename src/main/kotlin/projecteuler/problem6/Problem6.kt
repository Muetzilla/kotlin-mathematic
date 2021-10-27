package projecteuler.problem6

/**
 * The sum of the squares of the first ten natural numbers is,
 * The square of the sum of the first ten natural numbers is,
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
fun main(args: Array<String>) {
    var sumOfSquare = 0
    var sumOfNumbersUntil100 = 0
    for (i in 1..100) {
        sumOfSquare += i * i
    }
    for (i in 1..100) {
        sumOfNumbersUntil100 += i
    }
    println("The difference between is: " + (sumOfNumbersUntil100 * sumOfNumbersUntil100 - sumOfSquare))
}