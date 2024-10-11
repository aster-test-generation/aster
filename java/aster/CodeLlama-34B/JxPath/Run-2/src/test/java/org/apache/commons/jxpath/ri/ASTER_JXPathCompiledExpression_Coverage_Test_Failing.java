/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.Iterator;
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
    private Constant expression;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_Yemp0() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        expression.removePath(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePathWithParentContext_cGOW1() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext parentContext = new JXPathContextReferenceImpl(null, null);
        JXPathContext context = new JXPathContextReferenceImpl(parentContext, null);
        expression.removePath(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullContext_aySf1() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = null;
        Object value = new Object();
        try {
            expression.setValue(context, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("context", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathAndSetValue1_IzTc0() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        Object value = new Object();
        Pointer pointer = expression.createPathAndSetValue(context, value);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointersWithNullContext_dKeV1() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = null;
        Iterator<Pointer> pointers = expression.iteratePointers(context);
        assertNull(pointers);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointersWithNullContext_dKeV1_fid1() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = null;
        Iterator<Pointer> pointers = expression.iteratePointers(context);
        assertNotNull(pointers);
    }
}