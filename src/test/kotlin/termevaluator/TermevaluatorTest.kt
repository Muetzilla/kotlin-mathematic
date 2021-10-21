package termevaluator

import org.junit.Test
import kotlin.test.junit.JUnitAsserter

internal class TermevaluatorTest {
    @Test
    fun testParseOneDigitNumbers() {
        val termEv = Termevaluator()
        val expectedResult = listOf(1, 2)
        JUnitAsserter.assertEquals("Test failed", expectedResult, termEv.parseIntsFromTerm("1 + 2"))
    }

    @Test
    fun testParseMultipleDigitsNumbers() {
        val termEv = Termevaluator()
        val expectedResult = listOf(12, 345)
        JUnitAsserter.assertEquals("Test failed", expectedResult, termEv.parseIntsFromTerm("12 + 345"))
    }

    @Test
    fun testParseMultipleDigitsNumbersWithThreeNumbers() {
        val termEv = Termevaluator()
        val expectedResult = listOf(12, 345, 678)
        JUnitAsserter.assertEquals("Test failed", expectedResult, termEv.parseIntsFromTerm("12 + 345 + 678"))
    }

    @Test
    fun testParseMultipleDigitsNumbersWithChars() {
        val termEv = Termevaluator()
        val expectedResult = listOf(345, 678)
        JUnitAsserter.assertEquals("Test failed", expectedResult, termEv.parseIntsFromTerm("12a + 345 + 678"))
    }

    @Test
    fun testParseOperationsFromTermSingleOperation() {
        val termEv = Termevaluator()
        val expectedResult = listOf(Operations.Addition)
        JUnitAsserter.assertEquals("Test failed", expectedResult, termEv.parseOperatorsFromTerm("12 + 345"))
    }

    @Test
    fun testParseOperationsFromTermMultipleDifferentOperations() {
        val termEv = Termevaluator()
        val expectedResult =
            listOf(Operations.Addition, Operations.Subtraction, Operations.Multiplication, Operations.Division)
        JUnitAsserter.assertEquals(
            "Test failed",
            expectedResult,
            termEv.parseOperatorsFromTerm("12 + 345 - 678 * 9 / 10")
        )
    }

    @Test
    fun testParseOperationsFromTermDifferentDivisonChars() {
        val termEv = Termevaluator()
        val expectedResult = listOf(Operations.Division, Operations.Division)
        JUnitAsserter.assertEquals("Test failed", expectedResult, termEv.parseOperatorsFromTerm("12 : 345 / 678"))
    }
}