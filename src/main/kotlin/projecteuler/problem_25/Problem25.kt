package projecteuler.problem_25

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    println("First fibonacci number of 1000 Digits: " + getLengthOfFib(1000))
}

fun getLengthOfFib(fib: Int): Int {
    return Math.ceil(4.78497 * fib - 3.1127).roundToInt()
} 