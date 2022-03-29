package projecteuler.problem_10

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
fun main(args: Array<String>) {
    val max = 2_000_000
    var result = 0L
    for (i in 0..max) {
        if(isPrime(i)){
            result += i
        }
    }
    print("The sum of all the primes below two million is: $result")
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

    val root = Math.sqrt(num.toDouble()).toInt()
    var isPrime = true
    for (i in 3..root step 2) {
        if ((num % i) == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}