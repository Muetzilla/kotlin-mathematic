package projecteuler.problem_10

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
fun main(args: Array<String>) {
    var prim = 2_000_000
    var result = 0
    var isNonPrime = false
    for (i in 2..2_000_000) {
        for (j in 2..i / 2) {
            if (i % j == 0) {
                isNonPrime = true
            }
        }
        if (!isNonPrime) {
            result += i
            println("$i is a prime")
        }
        isNonPrime = false
    }
    print("The sum of all the primes below two million is: $result")
}