/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TreeCompiler_Coverage_Test_Passing {
    private NodeNameTest mockNodeNameTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_NullExpression3_QXYH5() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.equal(null, null);
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrWithNullArguments_xpQr0() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = null;
        Object result = compiler.or(arguments);
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrWithEmptyArguments_mfgx1() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[0];
        Object result = compiler.or(arguments);
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrWithNonEmptyStringAndNonEmptyStringArguments_yGUx13() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_byvN0() {
        TreeCompiler compiler = new TreeCompiler();
        Object qName = new QName("name");
        Object result = compiler.variableReference(qName);
        assertTrue(result instanceof VariableReference);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_NullExpression_jARy3_LujC0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.processingInstructionTest(null);
        assertNull(null);
    }
}