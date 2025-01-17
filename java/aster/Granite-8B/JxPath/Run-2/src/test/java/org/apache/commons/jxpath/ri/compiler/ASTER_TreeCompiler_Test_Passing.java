/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TreeCompiler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_omgs0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[2];
        arguments[0] = new CoreOperationAnd(new Expression[0]);
        arguments[1] = new CoreOperationAnd(new Expression[0]);
        Object result = treeCompiler.and(arguments);
        assertNotNull(result);
        assertTrue(result instanceof CoreOperationAnd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_Canq0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.nodeTypeTest(1);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQname_jNme0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        String prefix = "prefix";
        String name = "name";
        Object actualResult = treeCompiler.qname(prefix, name);
        Object expectedResult = new QName(prefix, name);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_omgs0_1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[2];
        arguments[0] = new CoreOperationAnd(new Expression[0]);
        arguments[1] = new CoreOperationAnd(new Expression[0]);
        Object result = treeCompiler.and(arguments);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_omgs0_2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[2];
        arguments[0] = new CoreOperationAnd(new Expression[0]);
        arguments[1] = new CoreOperationAnd(new Expression[0]);
        Object result = treeCompiler.and(arguments);
        assertTrue(result instanceof CoreOperationAnd);
    }
}