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
}