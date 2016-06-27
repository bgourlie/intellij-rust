package org.rust.lang.core.parser

import com.intellij.psi.PsiFile
import org.assertj.core.api.Assertions.assertThat

class RustCompleteParsingTestCase : RustParsingTestCaseBase("complete") {

    fun testFn() = doTest(true)
    fun testExpr() = doTest(true)
    fun testMod() = doTest(true)
    fun testUseItem() = doTest(true)
    fun testType() = doTest(true)
    fun testShifts() = doTest(true)
    fun testPatterns() = doTest(true)
    fun testAttributes() = doTest(true)
    fun testTraits() = doTest(true)
    fun testMacros() = doTest(true)
    fun testImpls() = doTest(true)
    fun testSuper() = doTest(true)
    fun testRanges() = doTest(true)
    fun testExternCrates() = doTest(true)
    fun testExternFns() = doTest(true)
    fun testExternBlock() = doTest(true)
    fun testSuperPaths() = doTest(true)
    fun testPrecedence() = doTest(true)
    fun testWayTooManyParens() = doTest(true)
    fun testWayTooManyBraces() = doTest(true)
    fun testEmptyGenerics() = doTest(true)
    fun testStructs() = doTest(true)
    fun testStructLiterals() = doTest(true)
    fun testTryOperator() = doTest(true)
    fun testMatch() = doTest(true)
    fun testOror() = doTest(true)
    fun testAndand() = doTest(true)
    fun testDocComments() = doTest(true)
    fun testAssociatedTypes() = doTest(true)

    fun testIssue320() = doTest(true)
    fun testIssue492() = doTest(true)

    override fun checkResult(targetDataName: String?, file: PsiFile?) {
        super.checkResult(targetDataName, file)
        assertThat(hasError(file!!))
            .withFailMessage("Error in well formed file ${file.name}")
            .isFalse()
    }

}
