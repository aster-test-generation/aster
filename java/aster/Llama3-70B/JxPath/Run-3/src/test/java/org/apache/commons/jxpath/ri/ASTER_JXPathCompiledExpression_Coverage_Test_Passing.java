/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import java.util.Iterator;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.Constant;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathCompiledExpression_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_withNullContext_wmpD1() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
        try {
            expression.removePath(null);
        } catch (NullPointerException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithContextReferenceImpl_DVYk0() {
        JXPathContext context = mock(JXPathContextReferenceImpl.class);
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
        Pointer pointer = mock(Pointer.class);
        when(((JXPathContextReferenceImpl) context).createPath("xpath", new Constant("string"))).thenReturn(pointer);
        assertEquals(pointer, expression.createPath(context));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ContextIsNull_ThrowsNullPointerException_Ubrv0() {
        JXPathCompiledExpression jXPathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("string"));
        try {
            jXPathCompiledExpression.setValue(null, new Object());
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointers_ContextIsInstanceOfJXPathContextReferenceImpl_zzat0() {
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
        String xpath = "xpath";
        Constant constant = new Constant("string");
        Iterator result = expression.iteratePointers(context);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithContext_Wbwk0() {
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
        Object result = expression.getValue(context);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointerWithContextReferenceImpl_DZIJ0() {
        JXPathContext context = new JXPathContextReferenceImpl(null, null);
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
        Pointer pointer = expression.getPointer(context, "xpath");
        assert pointer != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemoveAllWithContext_YYvJ0_JenP0() {
    JXPathContext context = JXPathContext.newContext(new Object());
    JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
    context = new JXPathContextReferenceImpl(context, new Object());
    expression.iterate(context);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithContext_YtNu0_mSIk0() {
    JXPathContext context = JXPathContext.newContext(new Object());
    JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
    Object result = expression.getValue(context, String.class);
}
@Test
public void testIterateWithContextCastException_tYYO1_rMXB0() {
    JXPathContext context = JXPathContext.newContext(new Object());
    JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
    Object wrongContext = new Object();
    try {
        expression.iterate((JXPathContext) wrongContext);
        fail("Expected ClassCastException");
    } catch (ClassCastException e) {
    }
}
@Test
public void testIterateWithContextNotReferenceImpl_STtg1_OBiv0_fid2() {
    JXPathContext context = new JXPathContextReferenceImpl(null, null);
    JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
    try {
        expression.iterate(context);
    } catch (ClassCastException e) {
        // No-op
    }
}
}