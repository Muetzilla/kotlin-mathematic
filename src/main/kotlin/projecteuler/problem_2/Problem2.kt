package projecteuler.problem_2

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
fun main(args: Array<String>) {
    var n1 = 1
    var n2 = 2
    var result = 0

    while (n1 <= 4000000) {
        var tempN1: Int
        if (n1 % 2 == 0) {
            result += n1
        }
        tempN1 = n1
        n1 = n2
        n2 += tempN1
    }

    print("The sum of all even fibonacci-terms is $result")
}