package projecteuler.problem_9

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

fun main(args: Array<String>) {
    val gesRes = 1000

    for(a in 1 .. gesRes){
        for(b in 1 ..gesRes){
            for (c in 1 .. gesRes){
                if(a * a +b * b == c * c && a + b + c == 1000){
                    println("The product of a, b and c is: " + (a * b * c))
                }
            }
        }
    }

}