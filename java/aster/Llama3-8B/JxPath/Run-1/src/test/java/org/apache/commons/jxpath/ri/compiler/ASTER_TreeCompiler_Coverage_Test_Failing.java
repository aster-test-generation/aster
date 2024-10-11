/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TreeCompiler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMod_WBoa0() throws Exception {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = treeCompiler.mod(left, right);
        assertEquals(CoreOperationMod.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrNonEmptyArray_oziA2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{new Object(), new Object()};
        Object result = treeCompiler.or(arguments);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPathNullArray_hPSb0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object expression = new Object();
        Object[] predicates = null;
        Object[] steps = null;
        Object result = treeCompiler.expressionPath(expression, predicates, steps);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPathNonNullArray_fkpX1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object expression = new Object();
        Object[] predicates = new Object[1];
        Object[] steps = new Object[1];
        Object result = treeCompiler.expressionPath(expression, predicates, steps);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPathEmptyArray_ILLw2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object expression = new Object();
        Object[] predicates = new Object[0];
        Object[] steps = new Object[0];
        Object result = treeCompiler.expressionPath(expression, predicates, steps);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPathNonEmptyArray_mepQ3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object expression = new Object();
        Object[] predicates = new Object[1];
        predicates[0] = new Object();
        Object[] steps = new Object[1];
        steps[0] = new Object();
        Object result = treeCompiler.expressionPath(expression, predicates, steps);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction_IRPI0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] args = new Object[]{"arg1", "arg2"};
        Object result = treeCompiler.function(1, args);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnion_QZDm0_1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{"a", "b", "c"};
        Object result = treeCompiler.union(arguments);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnion_QZDm0_2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{"a", "b", "c"};
        Object result = treeCompiler.union(arguments);
        assertEquals(CoreOperationUnion.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqual_mXKm0_Plkw0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new String("left");
        Object right = treeCompiler.processingInstructionTest("right");
        Object result = treeCompiler.notEqual(left, right);
        assertEquals("left != right", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnion_QZDm0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{"a", "b", "c"};
        Object result = treeCompiler.union(arguments);
        assertNotNull(result);
        assertEquals(CoreOperationUnion.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqual_mXKm0_Plkw0_fid3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new String("left");
        Object right = treeCompiler.processingInstructionTest("right");
        Object result = treeCompiler.notEqual(left, right);
        assertEquals("CoreOperationNotEqual(left, right)", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanOrEqual_MJZB0_RMdp0_fid3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Integer(5);
        Object right = new Integer(10);
        Object result = treeCompiler.processingInstructionTest("lessThanOrEqual(" + left + "," + right + ")");
        assertEquals("CoreOperationLessThanOrEqual object", result);
    }
}