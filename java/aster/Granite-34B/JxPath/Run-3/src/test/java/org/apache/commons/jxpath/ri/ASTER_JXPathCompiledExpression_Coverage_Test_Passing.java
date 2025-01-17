/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathCompiledExpression_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPointerTest1_SPJd0_YrEM0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
        Pointer pointer = expression.getPointer(context, "xpath");
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPointerTest2_BZWl1_UkFi0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant(1));
        Pointer pointer = expression.getPointer(context, "xpath");
        assertNotNull(pointer);
    }
}