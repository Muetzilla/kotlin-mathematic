package projecteuler.problem_14

/**
 * The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */

fun main(args: Array<String>) {
    var longestSequenceForNumber = 0
    var longestSequenceForNumberLength = 0
    for (i in 2..1_000_000) {
        var sequenceLength = 1
        var tempNum: Long = i.toLong()
        while (tempNum != 1L) {
            if ((tempNum % 2) == 0L) {
                tempNum /= 2
            } else {
                tempNum = tempNum * 3 + 1
            }
            sequenceLength++
        }
        if (sequenceLength > longestSequenceForNumberLength) {
            longestSequenceForNumber = i
            longestSequenceForNumberLength = sequenceLength
        }
    }
    println("The longest sequence is: " + longestSequenceForNumberLength + " digits long and achived by: " + longestSequenceForNumber)
}