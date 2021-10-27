package projecteuler.problem_30

import kotlin.math.pow

/**
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

 * 1634 = 14 + 64 + 34 + 44
 * 8208 = 84 + 24 + 04 + 84
 * 9474 = 94 + 44 + 74 + 44
 * As 1 = 14 is not a sum it is not included.
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */

fun main(args: Array<String>) {
    var result = 0
    var counter = 0
    for (i in 0..9) {
        for (j in 0..9) {
            for (k in 0..9) {
                for (l in 0..9) {
                    for (m in 0..9) {
                        for (n in 0..9) {
                            if (counter.toDouble() == (i.toDouble().pow(5.0) + j.toDouble().pow(5.0) + k.toDouble()
                                    .pow(5.0) + l.toDouble().pow(5.0) + m.toDouble().pow(5.0) + n.toDouble().pow(5.0))
                            ) {
                                result += counter
                            }
                            counter++
                        }
                    }
                }
            }
        }
    }
    //Because 1 is not a sum
    result--

    print("The sum of all the numbers that can be written as the sum of fifth powers of their digits: $result")
}