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
    val POTENCE = 5
    for (i in 0..9) {
        for (j in 0..9) {
            for (k in 0..9) {
                for (l in 0..9) {
                    for (m in 0..9) {
                        for (n in 0..9) {
                            if (counter.toDouble() == (i.toDouble().pow(POTENCE) + j.toDouble()
                                    .pow(POTENCE) + k.toDouble()
                                    .pow(POTENCE) + l.toDouble().pow(POTENCE) + m.toDouble().pow(POTENCE) + n.toDouble()
                                    .pow(POTENCE))
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