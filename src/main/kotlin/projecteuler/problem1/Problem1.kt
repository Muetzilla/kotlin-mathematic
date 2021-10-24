package projecteuler.problem1

/**
 * If we list all the natural  belnumbersow 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
fun main(args: Array<String>) {
    var result = 0
    for (i in 1..999) {
        if (i % 3 == 0 || i % 5 == 0) {
            result += i
        }
    }
    print("The sum of all the multiples of 3 or 5 below 1000 is $result")
}
