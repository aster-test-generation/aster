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
    public void testNodeNameTest_ixaO0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qname = new QName("namespace", "localPart");
        NodeNameTest nodeNameTest = (NodeNameTest) treeCompiler.nodeNameTest(qname);
        assertNotNull(nodeNameTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_FsjN0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.nodeTypeTest(1);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_QuXS0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qName = new QName("namespace", "localPart");
        Object result = treeCompiler.variableReference(qName);
        assertNotNull(result);
        assertTrue(result instanceof VariableReference);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath_TOsW0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] steps = new Object[]{};
        Object result = treeCompiler.locationPath(true, steps);
        assertNotNull(result);
        assertTrue(result instanceof LocationPath);
        LocationPath locationPath = (LocationPath) result;
        assertTrue(locationPath.isAbsolute());
        assertNotNull(locationPath.getSteps());
        assertEquals(0, locationPath.getSteps().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_tEsR0_fid1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{new Object(), new Object()};
        Object result = treeCompiler.processingInstructionTest("instruction");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_wdDI0_fid1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{"instruction"};
        Object result = treeCompiler.processingInstructionTest((String) arguments[0]);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_QuXS0_1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qName = new QName("namespace", "localPart");
        Object result = treeCompiler.variableReference(qName);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_QuXS0_2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qName = new QName("namespace", "localPart");
        Object result = treeCompiler.variableReference(qName);
        assertTrue(result instanceof VariableReference);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath_TOsW0_1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] steps = new Object[]{};
        Object result = treeCompiler.locationPath(true, steps);
        LocationPath locationPath = (LocationPath) result;
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath_TOsW0_2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] steps = new Object[]{};
        Object result = treeCompiler.locationPath(true, steps);
        LocationPath locationPath = (LocationPath) result;
        assertTrue(result instanceof LocationPath);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath_TOsW0_3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] steps = new Object[]{};
        Object result = treeCompiler.locationPath(true, steps);
        LocationPath locationPath = (LocationPath) result;
        assertTrue(locationPath.isAbsolute());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath_TOsW0_4() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] steps = new Object[]{};
        Object result = treeCompiler.locationPath(true, steps);
        LocationPath locationPath = (LocationPath) result;
        assertNotNull(locationPath.getSteps());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath_TOsW0_5() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] steps = new Object[]{};
        Object result = treeCompiler.locationPath(true, steps);
        LocationPath locationPath = (LocationPath) result;
        assertEquals(0, locationPath.getSteps().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_NameAttributeTest_FiAx0_MNLj0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest("instruction");
        assertTrue(result instanceof ProcessingInstructionTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_CoreOperationEqual_FBNM1_cgoa0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest("instruction");
        assertNotNull(result);
    }
}