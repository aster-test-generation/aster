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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathCompiledExpression_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_ZpWT0() {
        JXPathCompiledExpression jxPathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        jxPathCompiledExpression.removePath(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithJXPathContextReferenceImpl_InoQ0() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = expression.createPath(context);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathAndSetValue_JXPathContextReferenceImpl_xIFy0() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = expression.createPathAndSetValue(context, "value");
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointersWithNullContext_twoN1() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("//book", new Constant("book"));
        JXPathContext context = null;
        try {
            expression.iteratePointers(context);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("context", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullValue_axDY1_FjOj0() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        Object value = null;
        expression.setValue(context, value);
        assertEquals(value, context.getValue(expression.getExpression().toString()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullValue_axDY1_FjOj0_fid1() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        Object value = null;
        expression.setValue(context, value);
        assertNull(context.getValue(expression.getExpression().toString()));
    }
}