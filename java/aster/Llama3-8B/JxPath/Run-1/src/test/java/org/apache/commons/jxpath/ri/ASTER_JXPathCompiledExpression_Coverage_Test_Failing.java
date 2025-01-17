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
    public void testRemovePathWithNullContext_uADW1() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        jxpathCompiledExpression.removePath(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueNullContext_exwE1() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        jxpathCompiledExpression.setValue(null, new Object());
        assertNull(((JXPathContextReferenceImpl) null).getValue("xpath"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithNullContext_kyVP1() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        Pointer result = jxpathCompiledExpression.createPath(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAllWithNullContext_XSBm1() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        jxpathCompiledExpression.removeAll(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_zTqa0_vhYV0() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = JXPathContext.newContext(new Object());
        jxpathCompiledExpression.iterate(context);
        assertEquals("expression", ((JXPathContextReferenceImpl) context).getValue("xpath"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueNullValue_EPEq2_ovEU0() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl contextReference = new JXPathContextReferenceImpl(null, new Object());
        JXPathContext context = JXPathContext.newContext(contextReference, new Object());
        jxpathCompiledExpression.iterate(context);
        assertNull(context.getValue("xpath"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_lIGB0_UNFc0() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl contextReference = new JXPathContextReferenceImpl(null, new Object());
        JXPathContext context = JXPathContext.newContext(contextReference, new Object());
        Pointer result = jxpathCompiledExpression.createPath(context);
        assertNotNull(result);
    }
}