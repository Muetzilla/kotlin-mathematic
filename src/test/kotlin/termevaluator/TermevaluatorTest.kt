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

    @Test
    fun testTermIsCorrectNoInts() {
        val termEv = Termevaluator()
        val intsOfTerm = ArrayList<Int>()
        val operationsOfTerm = ArrayList<Operations>()
        JUnitAsserter.assertEquals("Test failed", false, termEv.checkCorrectTerm(intsOfTerm, operationsOfTerm))
    }

    @Test
    fun testTermIsCorrectCorrectTerm() {
        val termEv = Termevaluator()
        val intsOfTerm = ArrayList<Int>()
        intsOfTerm.addAll(listOf(5, 6))
        val operationsOfTerm = ArrayList<Operations>()
        operationsOfTerm.add(Operations.Addition)
        JUnitAsserter.assertEquals(
            "Test failed",
            true,
            termEv.checkCorrectTerm(intsOfTerm, operationsOfTerm)
        )
    }

    @Test
    fun testTermIsCorrectOnlyOneInts() {
        val termEv = Termevaluator()
        val intsOfTerm = ArrayList<Int>()
        intsOfTerm.addAll(listOf(5))
        val operationsOfTerm = ArrayList<Operations>()
        JUnitAsserter.assertEquals(
            "Test failed",
            true,
            termEv.checkCorrectTerm(intsOfTerm, operationsOfTerm)
        )
    }

    @Test
    fun testTermIsCorrectOnlyMoreIntsThenOperations() {
        val termEv = Termevaluator()
        val intsOfTerm = ArrayList<Int>()
        intsOfTerm.addAll(listOf(5, 6, 8))
        val operationsOfTerm = ArrayList<Operations>()
        operationsOfTerm.add(Operations.Addition)
        JUnitAsserter.assertEquals(
            "Test failed",
            false,
            termEv.checkCorrectTerm(intsOfTerm, operationsOfTerm)
        )
    }

    @Test
    fun testTermIsCorrectOnlyMoreOperationsThenints() {
        val termEv = Termevaluator()
        val intsOfTerm = ArrayList<Int>()
        intsOfTerm.add(5)
        val operationsOfTerm = ArrayList<Operations>()
        operationsOfTerm.addAll(listOf(Operations.Addition, Operations.Addition))
        JUnitAsserter.assertEquals(
            "Test failed",
            false,
            termEv.checkCorrectTerm(intsOfTerm, operationsOfTerm)
        )
    }

}