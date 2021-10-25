package projecteuler.problem3

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
fun main(args: Array<String>) {
    var prim = 600851475143
    val primeFactors = ArrayList<Long>()
    var tempPrimeFactor = 2L
    while (prim > 1) {
        while (prim % tempPrimeFactor == 0L) {
            primeFactors.add(tempPrimeFactor)
            prim /= tempPrimeFactor
        }
        tempPrimeFactor++;
    }
    print("The largest prime factor of 600851475143 is: " + primeFactors.maxOrNull())
}