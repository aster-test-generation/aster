/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathCompiledExpression_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_iIio0_CxUN0() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl contextReference = new JXPathContextReferenceImpl(null, null);
        JXPathContext context = JXPathContext.newContext(contextReference, new Object());
        jxpathCompiledExpression.iterate(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAll_EnbR0_nOOq0() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl contextReference = new JXPathContextReferenceImpl(null, null);
        JXPathContext context = JXPathContext.newContext(null, null);
        jxpathCompiledExpression.iterate(context);
    }
}