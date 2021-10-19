package fibonaccinumbers


import org.junit.Test
import kotlin.test.junit.JUnitAsserter.assertEquals


internal class FibonacciMainKtTest {
    @Test
    fun testFibFirst10() {
        val fibCalc = FibonacciMain()
        val expectedResult = listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
        assertEquals("bla", expectedResult, fibCalc.calculateFibonacciNumbers(10))
    }

    @Test
    fun testFibFirst1() {
        val fibCalc = FibonacciMain()
        val expectedResult = listOf(0)
        assertEquals("bla", expectedResult, fibCalc.calculateFibonacciNumbers(1))
    }

    @Test
    fun testFibFirst2() {
        val fibCalc = FibonacciMain()
        val expectedResult = listOf(0, 1)
        assertEquals("bla", expectedResult, fibCalc.calculateFibonacciNumbers(2))
    }
}