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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathCompiledExpression_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath1_IxJO0()
    {
        JXPathCompiledExpression obj = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        obj.removePath(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue1_fNzF0() {
        JXPathCompiledExpression fixture = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        Object value = new Object();
        fixture.setValue(context, value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_ZJtq0()
    {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        Pointer pointer = jxpathCompiledExpression.createPath(new JXPathContextReferenceImpl(null, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAll1_mtrf0() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        jxpathCompiledExpression.removeAll(context);
    }
}